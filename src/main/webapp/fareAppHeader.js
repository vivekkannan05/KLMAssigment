(function(){
    var app = angular.module("fareApp");
    app.controller("headerFareAppCtrl",headerFareAppCtrl);
    function headerFareAppCtrl(FareAppNameSvc){
        this.appname=FareAppNameSvc;
    }
})();