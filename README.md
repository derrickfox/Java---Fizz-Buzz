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

```JSON
"dashboards" : {
    "myInstruments": {
      "name": {…},
      "title": {…},
      "route": {…},
      "data": {…},
      "panels": {
          "searchPanel": {
               "title" : "Search",
               "type" : "ls-search-panel"
          },
          "instrumentPanel": {
                "title" : "Instruments",
                "type" : "ls-list-view",
                "options" : {
                     "listName" : "Instruments",
                     "defaultListView" : "tile",
                     "defaultDataView" : "Dashboard",
                     "onTileSelection" : "detail",
                     "onGridSelection" : "detail",
                     "tileOptions" : {
                          "tileTemplate" : "packages/ort/ui/manage_instruments/tileTemp.html",
                          "wrapTiles" " "true"
                     },
                     "viewSelectionDisabled" : "true",
                     "cacheDisabled" : "true"
                },
                "Header" : {
                     "preTitleActions" : {...},
                     "postTitleActions" : {...}
                }
          },
          "Filter": {
               "title" : "Filter",
               "type" : "ls-filter",
               "options" : {
                    "refPanelId" : [
                         "instrumentPanel"
                    ],
                    "groupByList" : [...],
                    "undefinedLabel" : "Untitled",
                    "height" : {...}
               }
          }
    }
}
```

        "dashboards" : {
            "myInstruments": {
              "name": {…},
              "title": {…},
              "route": {…},
              "data": {…},
              "panels": {
                  "searchPanel": {
                       "title" : "Search",
                       "type" : "ls-search-panel"
                  },
                  "instrumentPanel": {
                        "title" : "Instruments",
                        "type" : "ls-list-view",
                        "options" : {
                             "listName" : "Instruments",
                             "defaultListView" : "tile",
                             "defaultDataView" : "Dashboard",
                             "onTileSelection" : "detail",
                             "onGridSelection" : "detail",
                             "tileOptions" : {
                                  "tileTemplate" : "packages/ort/ui/manage_instruments/tileTemp.html",
                                  "wrapTiles" " "true"
                             },
                             "viewSelectionDisabled" : "true",   //dfafda
                             "cacheDisabled" : "true"
                        },
                        "Header" : {
                             "preTitleActions" : {...},
                             "postTitleActions" : {...}
                        }
                  },
                  "Filter": {
                       "title" : "Filter",
                       "type" : "ls-filter",
                       "options" : {
                            "refPanelId" : [
                                 "instrumentPanel"
                            ],
                            "groupByList" : [...],
                            "undefinedLabel" : "Untitled",
                            "height" : {...}
                       }
                  }
            }
        }
