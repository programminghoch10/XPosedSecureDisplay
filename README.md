# XPosedSecureDisplay

An Xposed Module to Enable `FLAG_SECURE`, disabling screenshots and recording absolutely everywhere.

This will give you the absolute privacy, as absolutely nothing is able to record or screenshot anything.

This is the exact opposite of [Disable-FLAG_SECURE](https://github.com/VarunS2002/Xposed-Disable-FLAG_SECURE) by [VarunS2002](https://github.com/VarunS2002).

## Requirements:

- Android 8.0+ (Oreo/SDK 26)

- XPosed framework installed properly like [EdXposed](https://github.com/ElderDrivers/EdXposed/)
  or [LSPosed](https://github.com/LSPosed/LSPosed/)

## Usage:

- EdXposed:
    - Normal Mode:
        - Enable the module and reboot
    - White List / Activation Scope Mode:
        - Enable the module
        - Select `Android System`
        - Select the target app in which you want to disable screenshots
        - Reboot
    - Black List Mode:
        - Enable the module
        - Do not select `Android System`
        - Do not select the target app in which you want to disable screenshots
        - Reboot
- LSPosed:
    - Enable the module
    - Select `System Framework`
    - Select the target app in which you want to disable screenshots
    - Reboot

## Note:

- This app does prevent apps from detecting that you've taken a screenshot or recorded it like Snapchat or Instagram,
  because you literally cannot take screenshots anymore.
  This disables it in all apps you select. So you can't screenshot your girlfriend's nudes.
  (But that probably does not matter since you're reading this anyway)

- Xposed Implementations Tested on:
    - [EdXposed](https://github.com/ElderDrivers/EdXposed/)
    - [LSPosed](https://github.com/LSPosed/LSPosed/)

- If you haven't noticed yet, this is a parody of [Disable-FLAG_SECURE](https://github.com/VarunS2002/Xposed-Disable-FLAG_SECURE) by [VarunS2002](https://github.com/VarunS2002). Thank you and all other contributors for your work.