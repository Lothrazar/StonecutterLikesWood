#!/bin/bash

[[ -z "$1" ]] && { echo "wood is empty for example: ./forkRecipe.sh spruce (modid)" ; exit 1; }

# assumes oak recipes are made, copies them to the destination wood type

wood=$1
seed="baobab"

modid="stonecutterlikeswood"
folder="src/main/resources/data/${modid}/recipes"

# make dir if it does not exist yet
mkdir -p "${folder}"/"${wood}"/

# list all valid file recipes
# TODO: improvement could be to loop on all files in /oak/ folder 
# 
declare -a arr=("boat" "button" "door" "fence" "gate" "hanging_sign" "log_sticks" "plate" "sign" "slab" "stairs" "stripped_log" "stripped_wood" "trapdoor" "wood_log"
# "slab_vertical" "post" "post_stripped"
#"wall" "wall_stripped" "framed_pattern" "framed" "slab_planks" "slab_stripped" "stairs_planks" "stairs_stripped"
)
arraylength=${#arr[@]}

for (( i=0; i<${arraylength}; i++ ));
do
  recipe="${arr[$i]}"
  
  # Copy the source oak recipe to the new input wood type
   
  cp -rf "${folder}"/$seed/"${recipe}".json "${folder}"/"${wood}"/$recipe.json
	
  # in the copied recipe, replace the string oak with the string for the input wood type 
  
  sed -i -e "s/$seed/${wood}/g" "${folder}"/$wood/$recipe.json 
  
  if [[ ! -z "$2" ]] then
	modid=$2
	
 
   sed -i -e "s/minecraft/${modid}/g" "${folder}"/$wood/$recipe.json 
  
  fi
  
	 
done
