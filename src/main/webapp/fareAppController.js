(function() {
	var app = angular.module("fareApp");
	app.controller("fareAppCtrl", fareAppCtrl);

	function fareAppCtrl(FareAppDataSVC) {
		var self = this;

		this.findFare = function() {
			
			FareAppDataSVC.findAirportDetails(self.start).then(function(data) {
				self.startDetails = data;
				console.log(self.startDetails);
			})
			
			FareAppDataSVC.findAirportDetails(self.dest).then(function(data) {
				self.endDetails = data;
				console.log(self.endDetails);
			})
			
			FareAppDataSVC.findFare(self.start,self.dest).then(function(data) {
				self.fareDetails = data;
				console.log(self.fareDetails);
			})
		
		
		}



	}
})();