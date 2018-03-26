WinWait("Select Signing Certificate in dialog")
if WinExists("Select Signing Certificate in dialog") Then
	MouseClick("primary",597,332,1,0 );
	MouseClick("primary",634,431,1,0 );
EndIf
