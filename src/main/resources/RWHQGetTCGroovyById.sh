#!/bin/bash

# List of IDs to iterate through
ids=("5956dcda37f5aeb002338e2a")
# "67bd3c7971eecb830de79b9d")
# "67bd68a771eecb830dea71a1"

# Base URL for the API
base_url="https://rwhq2.brightidea.cloud/testcasetocode"
cookie="AWSELBAuthSessionCookie-0=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; project=Brightidea; role=Developer; sessionid=2c1acb4763c059e9b20ee07db35ade3b774c534c; username=acooper12"


# Headers for the curl request
headers=(
  --header "host: rwhq2.brightidea.cloud"
  --header "Accept: */*"
  --header "sec-ch-ua: \"Google Chrome\";v=\"135\", \"Not-A.Brand\";v=\"8\", \"Chromium\";v=\"135\""
  --header "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36"
  --header "Content-Type: application/json"
  --header "Sec-Fetch-Dest: empty"
  --header "Sec-Fetch-Mode: cors"
  --header "Sec-Fetch-Site: same-origin"
  --header "X-Requested-With: XMLHttpRequest"
  --header "sec-ch-ua-mobile: ?0"
  --header "sec-ch-ua-platform: \"macOS\""
  --header "Cookie: $cookie" 
)

for id in "${ids[@]}"; do
  echo "Processing ID: $id"

  # Make the curl request and capture the response
  response=$(curl --location "$base_url" "${headers[@]}" --data "{\"_id\":\"$id\"}")

  # Log the raw response for debugging
  #echo "Raw response for ID $id: $response"

  # cleanup reponse
  cleaned_response=$(echo "$response" | tr -d '\000-\037')
  cleaned_response=$(echo "$cleaned_response" | tr -d '\r\n')

  #echo "cleaned response for ID $id: $response"


  # Check if the response is valid JSON
  #if ! echo "$response" | jq empty 2>/dev/null; then
  #  echo "Non-JSON response for ID: $id"
  #  echo "$response"
  #  continue
  #fi

  # Extract the "code" and the comment before the class
  code=$(echo "$cleaned_response" | jq -r '.code')
  echo "Extracted Code: $code"
  if [[ -z "$code" ]]; then
    echo "Failed to parse JSON for ID: $id"
    continue
  fi
  filename=$(echo "$cleaned_response" | grep -Eo '//.*?class' | sed 's|//||; s|class||' | tr -d ' ' | tr -d '\r\n').groovy
  echo "Extracted filename: $filename"
  cleaned_string=$(echo "$filename" | tr -d '\r\n')
  echo "Cleaned filename: $cleaned_string"
  # Save the code to a file
  if [[ -n "$cleaned_string" && -n "$code" ]]; then
    echo "$code" > "$cleaned_string"
    echo "Saved to $cleaned_string"
  else
    echo "Failed to process ID: $id"
  fi
done
