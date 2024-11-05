#!/bin/bash

echo "please only make sure its from novelhall"
echo ""
echo""
echo "what is the chatper number of the link"
read chapnum
echo ""
echo ""
echo "provide the link"
read link
echo ""
echo ""
echo "whats the last number of the chapter you want"
read want
curl $link > currentchapt.txt
#in loop
while [ $chapnum -le $want ] 
do
#this sleep range is not mine
	# Define the minimum and maximum values for the range
	min_value=1000
	max_value=35000
	echo "test2"
	# Loop until a random number is generated within the range
	while true; do
  	# Generate a random number between min_value and max_value
  	#random_sleep=$(($RANDOM % ($max_value - $min_value + 1) + $min_value))
  		random_sleep=$(bc <<< "scale=2; ($RANDOM % ($max_value - $min_value + 1) + $min_value) / 100")
	echo "test3"
  	# Check if the random number is within the desired range
 
    	# Sleep for the random duration
    		echo "Sleeping for $random_sleep seconds..."
    		sleep $random_sleep
    		break # Exit the loop after sleeping
	#	fi
	done

	echo "test4"
		# ">" is to replce the text file and ">>" is to append 
	#curl $link > currentchapt.txt
	
	

	#test for right chapter section 
	check=`cat currentchapt.txt | grep "text-align:" | grep "Chapter" | sed -e 's|<h1 style="text-align: center;">||g' | sed -e 's|</h1>||g' | sed -e 's/^[ \t]*//'`
	

	if [ "$check" = "Chapter $chapnum" ]; then 
		echo "chapter check passed"
	else
		echo "$check"
		echo "wrong chapter"
		echo "$chapnum"
		exit 1
	fi 
	#this part is for getting the novel text
	chap=`cat currentchapt.txt | grep -A 2 '<div class="entry-content" id="htmlContent">' | sed 's/<br>//g' | sed 's/<div class="entry-content" id="htmlContent">//g' | sed 's/<div>//g'`
	echo "Chapter $chapnum $chap" >> currentNoveltxt.txt
	
	chapnum=$(( $chapnum + 1 ))
	start=`cat currentchapt.txt | grep 'html" rel="next">Next</a' | sed "s|<a title=\"Chapter \$chapnum\" href=\"||g" | sed -e 's|" rel="next">Next</a>||g' | sed -e 's|^[ \t]*||g'`

	echo "https://www.novelhall.com$start"
	
	echo "chapter $chapnum"
	curl "https://www.novelhall.com$start" > currentchapt.txt
	
	
	echo ""
	echo "" 
	echo ""
       	echo ""
	echo ""
done

notify-send -u critical -t 0 "script done" "Next Chapter <a href='https://novelhall.com$start'>next thing</a>"


