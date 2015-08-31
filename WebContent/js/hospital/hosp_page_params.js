
function HospPage(){
	this.params = null;
};

HospPage.prototype.setParams = function(p) {
	this.params = p;
};

HospPage.prototype.getParams = function() {
	return this.params;
};

HospPage.prototype.processParams = function() {
	var parameters = location.search.substring(1).split("&");
	if(parameters[0] != ""){
		var json_str = "({";
		for(var i=0; i<parameters.length; i++){
			var p = parameters[i].split("=");
			if(	 isNaN( (function(p){try{ return parseInt(p[1]); } catch(err){ return null }})(p) )  ){
				parameters[i] = p[0]+":'"+p[1]+"'";
			}
			else{
				parameters[i] = p.join(":");
			}

			if(i+1 < parameters.length){
				parameters[i] += ",";
			}

			json_str += parameters[i];
		}
		json_str += "})";
		this.setParams(eval(json_str));
		console.log("params : ", this.getParams() );
	}
	else{
		this.setParams(eval("({})"));
		console.log("params : ", this.getParams() );
	}
};

var myHosp = null;

function initMyHosp(){
	myHosp = new HospPage();
	myHosp.processParams();
}