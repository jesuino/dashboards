dashbuilder = {
  /*
    // possible modes are EDITOR and CLIENT - if dashboards is set then CLIENT mode is assumed
	mode: "CLIENT",
	// The list of client dashboards - if CLIENT mode is used and no list is provided, than the dashboard "dashboard.yml" will be attempted to load. If no dashboard is found, then client opens for upload. 
	// The dashboard can also be an URL

	// base path to look for dashboards. Default is /

	// Set this as true to always hide the nav bar
	hideNavBar: true
*/
	allowExternal: true,
	path: "/dashboards",
	dashboards: [ 
		"https://raw.githubusercontent.com/jesuino/dashbuilder-yaml-samples/main/triton/Triton%20Inference%20Server%20Model%20Metrics.dash.yaml"
        ]
};
