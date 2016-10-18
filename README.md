#Manage Instruments Dashboard List Settings Configuration:

A manage instruments dashboard is a more specific version of a <a href="https://github.com/LabShare/facility/blob/master/docs/dashboard-readme.md">LabShare dashboard</a>. These dashboards tend to follow similar layout and styling. 
The typical elements of an instrumentation dashboard are as follows:

1.  Filter on the left side.
     1.1.   This filter usually offers the user options to filter on equipment type, location, and division.
     1.2.   There is typically a search bar on the top of the filter.
2.  List of instruments.
     2.1.   The instruments are presented to the user in tile-view by default.
     2.2.   The user has the option to switch to a grid-view if they prefer. 
     2.3.   Each instrument is represented by a tile. Each tile has a picture of the instrument, the building it resides, and the room to which it is located.
3.  Title of the dashboard on the top of the instrument list. 

The following are the elements that are specific to an instrument dashboard. For more information on how to configure the "name", "title", "route", and "data" keys please refer to the <a href="https://github.com/LabShare/facility/blob/master/docs/dashboard-readme.md">LabShare dashboard</a> document.

##Keys Defined
        "dashboards" : {
            "myInstruments": {                                                               // Name your dashboard what ever name you like. Should describe the dashboad.
              "name": {…},
              "title": {…},
              "route": {…},
              "data": {…},
              "panels": {
                  "searchPanel": {                                                           // Necessary for a managed instruments dashboard.
                       "title" : "Search",                                                   // Title of the panel.
                       "type" : "ls-search-panel"                                            // Tells the page which LabShare directive should be used to build this panel.
                  },
                  "instrumentPanel": {                                                       // Describes how the instruments will be retreived from SharePoint and presented to the user.
                        "title" : "Instruments",                                             // This value will appear on the top of the instruments panel.
                        "type" : "ls-list-view",                                             // Tells the page which LabShare directive should be used to get the information from SharePoint.
                        "options" : {
                             "listName" : "Instruments",                                     // Tells the page the name of the list in SharePoint to find the list of instruments.
                             "defaultListView" : "tile",                                     // Determines whether the instruments will be presented to the user in "tile" or "grid" layout.
                             "defaultDataView" : "Dashboard",                                // Determines which view from the list will be used to pull the data from SharePoint. Different views will have different contents.
                             "onTileSelection" : "detail",                                   // 
                             "onGridSelection" : "detail",                                   //
                             "tileOptions" : {
                                  "tileTemplate" :                                           // This is the path to the HTML file that defines how each dashboard tile will look. 
                                      "packages/ort/ui/manage_instruments/tileTemp.html",
                                  "wrapTiles" : "true"                                       // This tells the dashboard whether or not to wrap the layout of the tiles.
                             },
                             "viewSelectionDisabled" : "true",                               //
                             "cacheDisabled" : "true"                                        //
                        },
                        "Header" : {
                             "preTitleActions" : {...},                                      // Defines the buttons and their associated actions.
                             "postTitleActions" : {...}                                      // Defines the buttons and their associated actions.
                        }
                  },
                  "Filter": {
                       "title" : "Filter",                                                   // Title of the filter.
                       "type" : "ls-filter",                                                 // Tells the page which LabShare directive to use to construct the filter.
                       "options" : {
                            "refPanelId" : [
                                 "instrumentPanel"                                           // 
                            ],
                            "groupByList" : [                                                // An array that holds the individual filters that will appear in the filter panel.
                                 {
                                      "internalName" : "ExampleColumn",                      // This is the property of the list item that you can filter on. This is usually a column found in the SharePoint list that you are using. The internal name is spelled exactly how it appears in the URL.
                                      "label" : "Example Column",                            // This value will determine the text of the label of this particular filter on the panel itself. 
                                      "display" : "true",                                    // Determines whether this filter is displayed to the user.
                                      "checkbox" : {},                                       // 
                                      "result" : [],                                         // 
                                      "activeFilters" : [],                                  // 
                                      "order" : "byName"                                     // Determines how the options within the filter will be ordered. 
                                 }
                            ],                                           
                            "undefinedLabel" : "Untitled",                                   //
                            "height" : {...}                                                 //
                       }
                  }
            }
        },
        forms : {...}
        
1. Actual numbers don't matter, just that it's a number
⋅⋅1. Ordered sub-list
