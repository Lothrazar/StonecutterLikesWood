#!/bin/bash


[[ -z "$1" ]] && { echo "wood is empty for example: spruce" ; exit 1; }


declare -a arr=("boat" "button" "door" "fence" "gate" "hanging_sign" "log_sticks" "plate" "sign" "slab" "stairs" "stripped_log" "stripped_wood" "trapdoor" "wood_log")


wood=$1


modid="stonecutterlikeswood"
folder="src/main/resources/data/${modid}/recipes"



arraylength=${#arr[@]}
## now loop through the above array
# use for loop to read all values and indexes


for (( i=0; i<${arraylength}; i++ ));
do

   recipe="${arr[$i]}"
  # echo "$color"
   
   # blockstate      
	cp "${folder}"/oak/"${recipe}".json "${folder}"/"${wood}"/$recipe.json
	
	sed -i -e "s/oak/${wood}/g" "${folder}"/$wood/$recipe.json
	 
	 
done

