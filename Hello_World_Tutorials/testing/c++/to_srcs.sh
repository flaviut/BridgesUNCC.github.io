#!/bin/sh

dest_user_id="YOUR_USER_ID"
dest_api_key="YOUR_API_KEY"

src_user_id="kalpathi60"
src_api_key="486749122386"

for i in *.cpp
do
	sed -i "" s/$src_user_id/$dest_user_id/ $i
	sed -i "" s/$src_api_key/$dest_api_key/ $i
done
