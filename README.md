# For RunTimePermissions Module



* Extend your java class with GrantRunTimePermissionActivity



##call the following method for requesting permissions

```
/**
*  @param permissionList--> array of string of Request
*  @param request Code --> request code
*  @param permissionExplanation --> explanation
*  @param view --> view for Snackbar
*  @param tag --> key value for storing meta data in shared preference,
*                              should be unique for every grantPermisssion() method call statement.
*/
grantPermission(String[] permissionList, int requestCode,
                 String permissionExplanation, View view,
                 String tag);


```

##Callback method

```
 /**
     *@Objective callback method for request permissions
     *@param requestCode --> request code
     *@param isAllGranted --> true if all the requested permissions have been granted by the user
     * @param grantResults --> int array with permission status corresponding to the permissions in permissionList.
     *                      0  --> if permission granted
     *                      -1 ---> if permission denied
     *                      -2 --> if permission denied with Don't ask again checked
     *
     */
public void onPermissionResult(String[] permissionList, int requestCode,
                               boolean isAllGranted, int[] grantResult)


```

