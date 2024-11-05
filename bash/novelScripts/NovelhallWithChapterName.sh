#!/bin/bash

echo "please only make ssure its from novelhall"
echo ""
echo""
read -p "what is the chatper number of the link: " chapnum
echo ""
echo ""
read -p "provide the link: " link
IFS='/' read -ra parts <<< "$link"
echo ""
echo ""
read -p "whats the last number of the chapter you want: " want
curl $link > currentchapt.txt
#in loop
while [ $chapnum -le $want ] 
do

	usleep $((RANDOM * 8 * 99 ))
	
		# ">" is to replce the text file and ">>" is to append 
	#curl $link > currentchapt.txt
	
	

	#test for right chapter section 
	#check=`cat currentchapt.txt | grep "text-align:" | grep "Chapter" | sed -e 's|<h1 style="text-align: center;">||g' | sed -e 's|</h1>||g' | sed -e 's/^[ \t]*//' | grep -o 'Chapter [0-9]\+'`
	check=`cat currentchapt.txt | grep "text-align:" | grep "Chapter" | sed -e 's|<h1 style="text-align: center;">||g' | sed -e 's|</h1>||g' | sed -e 's/^[ \t]*//' | grep -o 'Chapter [0-9]\+'`

	if [ "$check" = "Chapter $chapnum" ]; then 
		echo "chapter check passed"
		#this part is for getting the novel text
		chap=`cat currentchapt.txt | grep -A 2 '<div class="entry-content" id="htmlContent">' | sed 's/<br>/\n/g' | sed 's/<div class="entry-content" id="htmlContent">//g' | sed -e 's/<div>/\n/g'`
		echo "Chapter $chapnum $chap" >> currentNoveltxt.txt

		chapnum=$(( $chapnum + 1 ))
        #start=`cat currentchapt.txt | grep 'html" rel="next">Next</a' | sed "s|<a title=\"Chapter \$chapnum\" href=\"||g" | sed -e 's|" rel="next">Next</a>||g' | sed -e 's|^[ \t]*||g'`
        #start=`cat currentchapt.txt | grep '<a title="Chapter '$chapnum'\"' | grep -o '/the-world-of-gods-rises-from-the-zerg-29634/[0-9]\+.html'`
		start=`cat currentchapt.txt | grep '<a title="Chapter ' | grep 'rel="next">Next' | grep -o '/[0-9]\+.html'`
		#echo "https://www.novelhall.com$start"
		echo "Got Chapter"

		echo "chapter $chapnum"
		echo "https://${parts[2]}/${parts[3]}$start"
		curl "https://${parts[2]}/${parts[3]}$start" > currentchapt.txt
		date +'%I:%M%p'
	else
		echo "$check"
		echo "wrong chapter"
		echo "Chapter $chapnum"
		start=`cat currentchapt.txt | grep '<a title="Chapter ' | grep 'rel="next">Next' | grep -o '/[0-9]\+.html'`
		echo "https://${parts[2]}/${parts[3]}$start"
		curl "https://${parts[2]}/${parts[3]}$start" > currentchapt.txt
	fi 
	echo "" 
	echo ""
done
#./DiscordNot.sh
