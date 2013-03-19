environments {
    test {
        modules = {
            'jquery' { 
                resource url:'js/jquery/jquery-1.4.2-b.min.js', disposition:'head'
            }
			testurl {
				resource url: 'http://fonts.googleapis.com/css?family=PT+Sans:400,700&subset=latin,cyrillic', 
				          disposition: 'head', 
						  attrs: [type: 'css']
			}
			'google-maps' {
				resource url: 'http://maps.googleapis.com/maps/api/js?libraries=places&sensor=false', attrs: [type: 'js']
			}
			
			'testAppAccess' {
				resource id:'testAppAccess', 
				         url: "css/main.css",
						 wrapper: {"<!--${grailsApplication.ENV_DEVELOPMENT}-->"}
			}

            'GPRESOURCES-210_module_A' {
                resource url: "/GPRESOURCES-210/file1.js", disposition: "duplicate_includes_check"
                resource url: "/GPRESOURCES-210/file2.js", disposition: "duplicate_includes_check"
            }
        }
    }
}