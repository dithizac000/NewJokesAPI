// wait until page loads
window.onload = function() {
  // create objt GEt request
  let url = "http://localhost:8080/api/joke";

  let param = {
      method: "get"
  };

  fetch(uri, params)
      .then(function(response) {
         return response.json();
      })
      .then(function(json) {
          console.log(json);
      });
};

function showJokes(data) {
    //access the list in our html
    let jokesList = document.getElementById("jokes-list");
    for(let i = 0; i < data.length; i++) {
        let joke = data[i];

        // create list
        let li = document.createElement("li");
        li.innerText = joke.jokeText;

        // add the list item to the list
        jokesList.apendChild(li);
    }


};