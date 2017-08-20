(function () {
    var app = angular.module("fareApp");
    app.service("FareAppDataSVC", function ($http,$q) {
        var self = this;
        self.fetchAllAirports = function (){
            var promise1 = $http.get('http://localhost:7005/airportdetails');
            var promise2=promise1.then(function(response) {
                return response.data;
            });
            return promise2;
        }

        self.findFare = function (from,dest) {
        	var promise3=$http.get('http://localhost:7005/faredetails/' + from+'/'+dest);
        	var promise31=promise3.then(function (response) {
        		return response.data;
        	});
        	return promise31;
        }
        self.findAirportDetails = function (code) {
        	var promise3=$http.get('http://localhost:7005/airportdetails/'+code);
        	var promise31=promise3.then(function (response) {
        		return response.data;
        	});
        	return promise31;
        }
    });
})();