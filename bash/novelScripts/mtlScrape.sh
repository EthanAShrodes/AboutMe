#!/bin/bash

rm mtltextfile.txt
echo "pull up the chapter on left side of the screen"
echo "if not exit script and do that"
echo "name the file you want the text in"
read chap
echo "how many chapers do you want?"
read outcome
#open another terminal 
	xdotool key alt+ctrl+t
	sleep 2
	xdotool key c d space n o v e l S c r i p t s Return
	sleep 2
#open to vim
	xdotool key v i m space m t l t e x t f i l e period t x t Return
	sleep 1
	xdotool key i

	xdotool mousemove 466 413
	xdotool click 1
chapnum=1
while [ $chapnum -le $outcome ]
do
	usleep $((RANDOM * 8 * 99 ))

#coping the stuff
	xdotool key ctrl+a
	sleep 1
	xdotool key ctrl+c
	sleep 1

#going to next chapter 
	xdotool mousemove 566 323	
	xdotool click 1
	sleep 1

#tab to the next screen
	xdotool key alt+Tab
#open to vim
	xdotool key o
#past to vim tab 
	xdotool key ctrl+Shift+v
	xdotool key Escape
	xdotool key colon w Return

#making sure that focus is on the left side of the screen
	xdotool mousemove 566 413
	xdotool click 1
	
	chapnum=$(( $chapnum + 1 ))
done
xdotool key alt+Tab
sleep 2
xdotool key Escape
sleep 2
xdotool key colon w q Return
sleep 2
mv mtltextfile.txt $chap.txt
sleep 2

./DiscordNot.sh
xdotool key ctrl+w
	#move mouse to next chapter button
	#xdotool mousemove 566 313
	#click the button for next chapter 
	#xdotool click 1 
