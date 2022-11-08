package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later. */
    private Boolean _addingGameCenterFriendsBlocked;
    /** Indicates whether or not to allow AirDrop. */
    private Boolean _airDropBlocked;
    /** Indicates whether or to block users from unlocking their Mac with Apple Watch. */
    private Boolean _appleWatchBlockAutoUnlock;
    /** Indicates whether or not to block the user from accessing the camera of the device. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager. */
    private Boolean _classroomAppBlockRemoteScreenObservation;
    /** Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager. */
    private Boolean _classroomAppForceUnpromptedScreenObservation;
    /** Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager. */
    private Boolean _classroomForceAutomaticallyJoinClasses;
    /** Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager. */
    private Boolean _classroomForceRequestPermissionToLeaveClasses;
    /** Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager. */
    private Boolean _classroomForceUnpromptedAppAndDeviceLock;
    /** Possible values of the compliance app list. */
    private AppListType _compliantAppListType;
    /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
    private java.util.List<AppListItem> _compliantAppsList;
    /** Indicates whether or not to allow content caching. */
    private Boolean _contentCachingBlocked;
    /** Indicates whether or not to block definition lookup. */
    private Boolean _definitionLookupBlocked;
    /** An email address lacking a suffix that matches any of these strings will be considered out-of-domain. */
    private java.util.List<String> _emailInDomainSuffixes;
    /** TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later. */
    private Boolean _eraseContentAndSettingsBlocked;
    /** Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later. */
    private Boolean _gameCenterBlocked;
    /** Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later). */
    private Boolean _iCloudBlockActivityContinuation;
    /** Indicates whether or not to block iCloud from syncing contacts. */
    private Boolean _iCloudBlockAddressBook;
    /** Indicates whether or not to block iCloud from syncing bookmarks. */
    private Boolean _iCloudBlockBookmarks;
    /** Indicates whether or not to block iCloud from syncing calendars. */
    private Boolean _iCloudBlockCalendar;
    /** Indicates whether or not to block iCloud document sync. */
    private Boolean _iCloudBlockDocumentSync;
    /** Indicates whether or not to block iCloud from syncing mail. */
    private Boolean _iCloudBlockMail;
    /** Indicates whether or not to block iCloud from syncing notes. */
    private Boolean _iCloudBlockNotes;
    /** Indicates whether or not to block iCloud Photo Library. */
    private Boolean _iCloudBlockPhotoLibrary;
    /** Indicates whether or not to block iCloud from syncing reminders. */
    private Boolean _iCloudBlockReminders;
    /** When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later. */
    private Boolean _iCloudDesktopAndDocumentsBlocked;
    /** iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later. */
    private Boolean _iCloudPrivateRelayBlocked;
    /** Indicates whether or not to block files from being transferred using iTunes. */
    private Boolean _iTunesBlockFileSharing;
    /** Indicates whether or not to block Music service and revert Music app to classic mode. */
    private Boolean _iTunesBlockMusicService;
    /** Indicates whether or not to block the user from using dictation input. */
    private Boolean _keyboardBlockDictation;
    /** Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later). */
    private Boolean _keychainBlockCloudSync;
    /** TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later. */
    private Boolean _multiplayerGamingBlocked;
    /** Indicates whether or not to block sharing passwords with the AirDrop passwords feature. */
    private Boolean _passwordBlockAirDropSharing;
    /** Indicates whether or not to block the AutoFill Passwords feature. */
    private Boolean _passwordBlockAutoFill;
    /** Indicates whether or not to block fingerprint unlock. */
    private Boolean _passwordBlockFingerprintUnlock;
    /** Indicates whether or not to allow passcode modification. */
    private Boolean _passwordBlockModification;
    /** Indicates whether or not to block requesting passwords from nearby devices. */
    private Boolean _passwordBlockProximityRequests;
    /** Block simple passwords. */
    private Boolean _passwordBlockSimple;
    /** Number of days before the password expires. */
    private Integer _passwordExpirationDays;
    /** The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11 */
    private Integer _passwordMaximumAttemptCount;
    /** Number of character sets a password must contain. Valid values 0 to 4 */
    private Integer _passwordMinimumCharacterSetCount;
    /** Minimum length of passwords. */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity required before a password is required. */
    private Integer _passwordMinutesOfInactivityBeforeLock;
    /** Minutes of inactivity required before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached. */
    private Integer _passwordMinutesUntilFailedLoginReset;
    /** Number of previous passwords to block. */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Whether or not to require a password. */
    private Boolean _passwordRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** List of privacy preference policy controls. This collection can contain a maximum of 10000 elements. */
    private java.util.List<MacOSPrivacyAccessControlItem> _privacyAccessControls;
    /** Indicates whether or not to block the user from using Auto fill in Safari. */
    private Boolean _safariBlockAutofill;
    /** Indicates whether or not to block the user from taking Screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90 */
    private Integer _softwareUpdateMajorOSDeferredInstallDelayInDays;
    /** Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90 */
    private Integer _softwareUpdateMinorOSDeferredInstallDelayInDays;
    /** Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90 */
    private Integer _softwareUpdateNonOSDeferredInstallDelayInDays;
    /** Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90 */
    private Integer _softwareUpdatesEnforcedDelayInDays;
    /** Indicates whether or not to block Spotlight from returning any results from an Internet search. */
    private Boolean _spotlightBlockInternetResults;
    /** Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647 */
    private Integer _touchIdTimeoutInHours;
    /** Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility. */
    private MacOSSoftwareUpdateDelayPolicy _updateDelayPolicy;
    /** TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later. */
    private Boolean _wallpaperModificationBlocked;
    /**
     * Instantiates a new MacOSGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSGeneralDeviceConfiguration();
    }
    /**
     * Gets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAddingGameCenterFriendsBlocked() {
        return this._addingGameCenterFriendsBlocked;
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this._airDropBlocked;
    }
    /**
     * Gets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleWatchBlockAutoUnlock() {
        return this._appleWatchBlockAutoUnlock;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this._classroomAppBlockRemoteScreenObservation;
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this._classroomAppForceUnpromptedScreenObservation;
    }
    /**
     * Gets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomForceAutomaticallyJoinClasses() {
        return this._classroomForceAutomaticallyJoinClasses;
    }
    /**
     * Gets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomForceRequestPermissionToLeaveClasses() {
        return this._classroomForceRequestPermissionToLeaveClasses;
    }
    /**
     * Gets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getClassroomForceUnpromptedAppAndDeviceLock() {
        return this._classroomForceUnpromptedAppAndDeviceLock;
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @javax.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this._compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this._compliantAppsList;
    }
    /**
     * Gets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContentCachingBlocked() {
        return this._contentCachingBlocked;
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this._definitionLookupBlocked;
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this._emailInDomainSuffixes;
    }
    /**
     * Gets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEraseContentAndSettingsBlocked() {
        return this._eraseContentAndSettingsBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSGeneralDeviceConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("addingGameCenterFriendsBlocked", (n) -> { currentObject.setAddingGameCenterFriendsBlocked(n.getBooleanValue()); });
            this.put("airDropBlocked", (n) -> { currentObject.setAirDropBlocked(n.getBooleanValue()); });
            this.put("appleWatchBlockAutoUnlock", (n) -> { currentObject.setAppleWatchBlockAutoUnlock(n.getBooleanValue()); });
            this.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
            this.put("classroomAppBlockRemoteScreenObservation", (n) -> { currentObject.setClassroomAppBlockRemoteScreenObservation(n.getBooleanValue()); });
            this.put("classroomAppForceUnpromptedScreenObservation", (n) -> { currentObject.setClassroomAppForceUnpromptedScreenObservation(n.getBooleanValue()); });
            this.put("classroomForceAutomaticallyJoinClasses", (n) -> { currentObject.setClassroomForceAutomaticallyJoinClasses(n.getBooleanValue()); });
            this.put("classroomForceRequestPermissionToLeaveClasses", (n) -> { currentObject.setClassroomForceRequestPermissionToLeaveClasses(n.getBooleanValue()); });
            this.put("classroomForceUnpromptedAppAndDeviceLock", (n) -> { currentObject.setClassroomForceUnpromptedAppAndDeviceLock(n.getBooleanValue()); });
            this.put("compliantAppListType", (n) -> { currentObject.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
            this.put("compliantAppsList", (n) -> { currentObject.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("contentCachingBlocked", (n) -> { currentObject.setContentCachingBlocked(n.getBooleanValue()); });
            this.put("definitionLookupBlocked", (n) -> { currentObject.setDefinitionLookupBlocked(n.getBooleanValue()); });
            this.put("emailInDomainSuffixes", (n) -> { currentObject.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("eraseContentAndSettingsBlocked", (n) -> { currentObject.setEraseContentAndSettingsBlocked(n.getBooleanValue()); });
            this.put("gameCenterBlocked", (n) -> { currentObject.setGameCenterBlocked(n.getBooleanValue()); });
            this.put("iCloudBlockActivityContinuation", (n) -> { currentObject.setICloudBlockActivityContinuation(n.getBooleanValue()); });
            this.put("iCloudBlockAddressBook", (n) -> { currentObject.setICloudBlockAddressBook(n.getBooleanValue()); });
            this.put("iCloudBlockBookmarks", (n) -> { currentObject.setICloudBlockBookmarks(n.getBooleanValue()); });
            this.put("iCloudBlockCalendar", (n) -> { currentObject.setICloudBlockCalendar(n.getBooleanValue()); });
            this.put("iCloudBlockDocumentSync", (n) -> { currentObject.setICloudBlockDocumentSync(n.getBooleanValue()); });
            this.put("iCloudBlockMail", (n) -> { currentObject.setICloudBlockMail(n.getBooleanValue()); });
            this.put("iCloudBlockNotes", (n) -> { currentObject.setICloudBlockNotes(n.getBooleanValue()); });
            this.put("iCloudBlockPhotoLibrary", (n) -> { currentObject.setICloudBlockPhotoLibrary(n.getBooleanValue()); });
            this.put("iCloudBlockReminders", (n) -> { currentObject.setICloudBlockReminders(n.getBooleanValue()); });
            this.put("iCloudDesktopAndDocumentsBlocked", (n) -> { currentObject.setICloudDesktopAndDocumentsBlocked(n.getBooleanValue()); });
            this.put("iCloudPrivateRelayBlocked", (n) -> { currentObject.setICloudPrivateRelayBlocked(n.getBooleanValue()); });
            this.put("iTunesBlockFileSharing", (n) -> { currentObject.setITunesBlockFileSharing(n.getBooleanValue()); });
            this.put("iTunesBlockMusicService", (n) -> { currentObject.setITunesBlockMusicService(n.getBooleanValue()); });
            this.put("keyboardBlockDictation", (n) -> { currentObject.setKeyboardBlockDictation(n.getBooleanValue()); });
            this.put("keychainBlockCloudSync", (n) -> { currentObject.setKeychainBlockCloudSync(n.getBooleanValue()); });
            this.put("multiplayerGamingBlocked", (n) -> { currentObject.setMultiplayerGamingBlocked(n.getBooleanValue()); });
            this.put("passwordBlockAirDropSharing", (n) -> { currentObject.setPasswordBlockAirDropSharing(n.getBooleanValue()); });
            this.put("passwordBlockAutoFill", (n) -> { currentObject.setPasswordBlockAutoFill(n.getBooleanValue()); });
            this.put("passwordBlockFingerprintUnlock", (n) -> { currentObject.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
            this.put("passwordBlockModification", (n) -> { currentObject.setPasswordBlockModification(n.getBooleanValue()); });
            this.put("passwordBlockProximityRequests", (n) -> { currentObject.setPasswordBlockProximityRequests(n.getBooleanValue()); });
            this.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMaximumAttemptCount", (n) -> { currentObject.setPasswordMaximumAttemptCount(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordMinutesUntilFailedLoginReset", (n) -> { currentObject.setPasswordMinutesUntilFailedLoginReset(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("privacyAccessControls", (n) -> { currentObject.setPrivacyAccessControls(n.getCollectionOfObjectValues(MacOSPrivacyAccessControlItem::createFromDiscriminatorValue)); });
            this.put("safariBlockAutofill", (n) -> { currentObject.setSafariBlockAutofill(n.getBooleanValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("softwareUpdateMajorOSDeferredInstallDelayInDays", (n) -> { currentObject.setSoftwareUpdateMajorOSDeferredInstallDelayInDays(n.getIntegerValue()); });
            this.put("softwareUpdateMinorOSDeferredInstallDelayInDays", (n) -> { currentObject.setSoftwareUpdateMinorOSDeferredInstallDelayInDays(n.getIntegerValue()); });
            this.put("softwareUpdateNonOSDeferredInstallDelayInDays", (n) -> { currentObject.setSoftwareUpdateNonOSDeferredInstallDelayInDays(n.getIntegerValue()); });
            this.put("softwareUpdatesEnforcedDelayInDays", (n) -> { currentObject.setSoftwareUpdatesEnforcedDelayInDays(n.getIntegerValue()); });
            this.put("spotlightBlockInternetResults", (n) -> { currentObject.setSpotlightBlockInternetResults(n.getBooleanValue()); });
            this.put("touchIdTimeoutInHours", (n) -> { currentObject.setTouchIdTimeoutInHours(n.getIntegerValue()); });
            this.put("updateDelayPolicy", (n) -> { currentObject.setUpdateDelayPolicy(n.getEnumValue(MacOSSoftwareUpdateDelayPolicy.class)); });
            this.put("wallpaperModificationBlocked", (n) -> { currentObject.setWallpaperModificationBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this._gameCenterBlocked;
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this._iCloudBlockActivityContinuation;
    }
    /**
     * Gets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockAddressBook() {
        return this._iCloudBlockAddressBook;
    }
    /**
     * Gets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockBookmarks() {
        return this._iCloudBlockBookmarks;
    }
    /**
     * Gets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockCalendar() {
        return this._iCloudBlockCalendar;
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this._iCloudBlockDocumentSync;
    }
    /**
     * Gets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockMail() {
        return this._iCloudBlockMail;
    }
    /**
     * Gets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockNotes() {
        return this._iCloudBlockNotes;
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this._iCloudBlockPhotoLibrary;
    }
    /**
     * Gets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudBlockReminders() {
        return this._iCloudBlockReminders;
    }
    /**
     * Gets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudDesktopAndDocumentsBlocked() {
        return this._iCloudDesktopAndDocumentsBlocked;
    }
    /**
     * Gets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudPrivateRelayBlocked() {
        return this._iCloudPrivateRelayBlocked;
    }
    /**
     * Gets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getITunesBlockFileSharing() {
        return this._iTunesBlockFileSharing;
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this._iTunesBlockMusicService;
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this._keyboardBlockDictation;
    }
    /**
     * Gets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeychainBlockCloudSync() {
        return this._keychainBlockCloudSync;
    }
    /**
     * Gets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMultiplayerGamingBlocked() {
        return this._multiplayerGamingBlocked;
    }
    /**
     * Gets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockAirDropSharing() {
        return this._passwordBlockAirDropSharing;
    }
    /**
     * Gets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockAutoFill() {
        return this._passwordBlockAutoFill;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this._passwordBlockFingerprintUnlock;
    }
    /**
     * Gets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this._passwordBlockModification;
    }
    /**
     * Gets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockProximityRequests() {
        return this._passwordBlockProximityRequests;
    }
    /**
     * Gets the passwordBlockSimple property value. Block simple passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMaximumAttemptCount() {
        return this._passwordMaximumAttemptCount;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this._passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesUntilFailedLoginReset() {
        return this._passwordMinutesUntilFailedLoginReset;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @return a macOSPrivacyAccessControlItem
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSPrivacyAccessControlItem> getPrivacyAccessControls() {
        return this._privacyAccessControls;
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this._safariBlockAutofill;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSoftwareUpdateMajorOSDeferredInstallDelayInDays() {
        return this._softwareUpdateMajorOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSoftwareUpdateMinorOSDeferredInstallDelayInDays() {
        return this._softwareUpdateMinorOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSoftwareUpdateNonOSDeferredInstallDelayInDays() {
        return this._softwareUpdateNonOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSoftwareUpdatesEnforcedDelayInDays() {
        return this._softwareUpdatesEnforcedDelayInDays;
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this._spotlightBlockInternetResults;
    }
    /**
     * Gets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTouchIdTimeoutInHours() {
        return this._touchIdTimeoutInHours;
    }
    /**
     * Gets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @return a macOSSoftwareUpdateDelayPolicy
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateDelayPolicy getUpdateDelayPolicy() {
        return this._updateDelayPolicy;
    }
    /**
     * Gets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWallpaperModificationBlocked() {
        return this._wallpaperModificationBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("addingGameCenterFriendsBlocked", this.getAddingGameCenterFriendsBlocked());
        writer.writeBooleanValue("airDropBlocked", this.getAirDropBlocked());
        writer.writeBooleanValue("appleWatchBlockAutoUnlock", this.getAppleWatchBlockAutoUnlock());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("classroomAppBlockRemoteScreenObservation", this.getClassroomAppBlockRemoteScreenObservation());
        writer.writeBooleanValue("classroomAppForceUnpromptedScreenObservation", this.getClassroomAppForceUnpromptedScreenObservation());
        writer.writeBooleanValue("classroomForceAutomaticallyJoinClasses", this.getClassroomForceAutomaticallyJoinClasses());
        writer.writeBooleanValue("classroomForceRequestPermissionToLeaveClasses", this.getClassroomForceRequestPermissionToLeaveClasses());
        writer.writeBooleanValue("classroomForceUnpromptedAppAndDeviceLock", this.getClassroomForceUnpromptedAppAndDeviceLock());
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeBooleanValue("contentCachingBlocked", this.getContentCachingBlocked());
        writer.writeBooleanValue("definitionLookupBlocked", this.getDefinitionLookupBlocked());
        writer.writeCollectionOfPrimitiveValues("emailInDomainSuffixes", this.getEmailInDomainSuffixes());
        writer.writeBooleanValue("eraseContentAndSettingsBlocked", this.getEraseContentAndSettingsBlocked());
        writer.writeBooleanValue("gameCenterBlocked", this.getGameCenterBlocked());
        writer.writeBooleanValue("iCloudBlockActivityContinuation", this.getICloudBlockActivityContinuation());
        writer.writeBooleanValue("iCloudBlockAddressBook", this.getICloudBlockAddressBook());
        writer.writeBooleanValue("iCloudBlockBookmarks", this.getICloudBlockBookmarks());
        writer.writeBooleanValue("iCloudBlockCalendar", this.getICloudBlockCalendar());
        writer.writeBooleanValue("iCloudBlockDocumentSync", this.getICloudBlockDocumentSync());
        writer.writeBooleanValue("iCloudBlockMail", this.getICloudBlockMail());
        writer.writeBooleanValue("iCloudBlockNotes", this.getICloudBlockNotes());
        writer.writeBooleanValue("iCloudBlockPhotoLibrary", this.getICloudBlockPhotoLibrary());
        writer.writeBooleanValue("iCloudBlockReminders", this.getICloudBlockReminders());
        writer.writeBooleanValue("iCloudDesktopAndDocumentsBlocked", this.getICloudDesktopAndDocumentsBlocked());
        writer.writeBooleanValue("iCloudPrivateRelayBlocked", this.getICloudPrivateRelayBlocked());
        writer.writeBooleanValue("iTunesBlockFileSharing", this.getITunesBlockFileSharing());
        writer.writeBooleanValue("iTunesBlockMusicService", this.getITunesBlockMusicService());
        writer.writeBooleanValue("keyboardBlockDictation", this.getKeyboardBlockDictation());
        writer.writeBooleanValue("keychainBlockCloudSync", this.getKeychainBlockCloudSync());
        writer.writeBooleanValue("multiplayerGamingBlocked", this.getMultiplayerGamingBlocked());
        writer.writeBooleanValue("passwordBlockAirDropSharing", this.getPasswordBlockAirDropSharing());
        writer.writeBooleanValue("passwordBlockAutoFill", this.getPasswordBlockAutoFill());
        writer.writeBooleanValue("passwordBlockFingerprintUnlock", this.getPasswordBlockFingerprintUnlock());
        writer.writeBooleanValue("passwordBlockModification", this.getPasswordBlockModification());
        writer.writeBooleanValue("passwordBlockProximityRequests", this.getPasswordBlockProximityRequests());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMaximumAttemptCount", this.getPasswordMaximumAttemptCount());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordMinutesUntilFailedLoginReset", this.getPasswordMinutesUntilFailedLoginReset());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeCollectionOfObjectValues("privacyAccessControls", this.getPrivacyAccessControls());
        writer.writeBooleanValue("safariBlockAutofill", this.getSafariBlockAutofill());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeIntegerValue("softwareUpdateMajorOSDeferredInstallDelayInDays", this.getSoftwareUpdateMajorOSDeferredInstallDelayInDays());
        writer.writeIntegerValue("softwareUpdateMinorOSDeferredInstallDelayInDays", this.getSoftwareUpdateMinorOSDeferredInstallDelayInDays());
        writer.writeIntegerValue("softwareUpdateNonOSDeferredInstallDelayInDays", this.getSoftwareUpdateNonOSDeferredInstallDelayInDays());
        writer.writeIntegerValue("softwareUpdatesEnforcedDelayInDays", this.getSoftwareUpdatesEnforcedDelayInDays());
        writer.writeBooleanValue("spotlightBlockInternetResults", this.getSpotlightBlockInternetResults());
        writer.writeIntegerValue("touchIdTimeoutInHours", this.getTouchIdTimeoutInHours());
        writer.writeEnumValue("updateDelayPolicy", this.getUpdateDelayPolicy());
        writer.writeBooleanValue("wallpaperModificationBlocked", this.getWallpaperModificationBlocked());
    }
    /**
     * Sets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the addingGameCenterFriendsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddingGameCenterFriendsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._addingGameCenterFriendsBlocked = value;
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @param value Value to set for the airDropBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAirDropBlocked(@javax.annotation.Nullable final Boolean value) {
        this._airDropBlocked = value;
    }
    /**
     * Sets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @param value Value to set for the appleWatchBlockAutoUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleWatchBlockAutoUnlock(@javax.annotation.Nullable final Boolean value) {
        this._appleWatchBlockAutoUnlock = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomAppBlockRemoteScreenObservation(@javax.annotation.Nullable final Boolean value) {
        this._classroomAppBlockRemoteScreenObservation = value;
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomAppForceUnpromptedScreenObservation(@javax.annotation.Nullable final Boolean value) {
        this._classroomAppForceUnpromptedScreenObservation = value;
    }
    /**
     * Sets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceAutomaticallyJoinClasses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomForceAutomaticallyJoinClasses(@javax.annotation.Nullable final Boolean value) {
        this._classroomForceAutomaticallyJoinClasses = value;
    }
    /**
     * Sets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceRequestPermissionToLeaveClasses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomForceRequestPermissionToLeaveClasses(@javax.annotation.Nullable final Boolean value) {
        this._classroomForceRequestPermissionToLeaveClasses = value;
    }
    /**
     * Sets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceUnpromptedAppAndDeviceLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassroomForceUnpromptedAppAndDeviceLock(@javax.annotation.Nullable final Boolean value) {
        this._classroomForceUnpromptedAppAndDeviceLock = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppListType(@javax.annotation.Nullable final AppListType value) {
        this._compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._compliantAppsList = value;
    }
    /**
     * Sets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @param value Value to set for the contentCachingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCachingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._contentCachingBlocked = value;
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @param value Value to set for the definitionLookupBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionLookupBlocked(@javax.annotation.Nullable final Boolean value) {
        this._definitionLookupBlocked = value;
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailInDomainSuffixes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._emailInDomainSuffixes = value;
    }
    /**
     * Sets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @param value Value to set for the eraseContentAndSettingsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEraseContentAndSettingsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._eraseContentAndSettingsBlocked = value;
    }
    /**
     * Sets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the gameCenterBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGameCenterBlocked(@javax.annotation.Nullable final Boolean value) {
        this._gameCenterBlocked = value;
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockActivityContinuation(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockActivityContinuation = value;
    }
    /**
     * Sets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @param value Value to set for the iCloudBlockAddressBook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockAddressBook(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockAddressBook = value;
    }
    /**
     * Sets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @param value Value to set for the iCloudBlockBookmarks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockBookmarks(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockBookmarks = value;
    }
    /**
     * Sets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @param value Value to set for the iCloudBlockCalendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockCalendar(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockCalendar = value;
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockDocumentSync(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockDocumentSync = value;
    }
    /**
     * Sets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @param value Value to set for the iCloudBlockMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockMail(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockMail = value;
    }
    /**
     * Sets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @param value Value to set for the iCloudBlockNotes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockNotes(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockNotes = value;
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockPhotoLibrary(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockPhotoLibrary = value;
    }
    /**
     * Sets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @param value Value to set for the iCloudBlockReminders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudBlockReminders(@javax.annotation.Nullable final Boolean value) {
        this._iCloudBlockReminders = value;
    }
    /**
     * Sets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @param value Value to set for the iCloudDesktopAndDocumentsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudDesktopAndDocumentsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._iCloudDesktopAndDocumentsBlocked = value;
    }
    /**
     * Sets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @param value Value to set for the iCloudPrivateRelayBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudPrivateRelayBlocked(@javax.annotation.Nullable final Boolean value) {
        this._iCloudPrivateRelayBlocked = value;
    }
    /**
     * Sets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @param value Value to set for the iTunesBlockFileSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesBlockFileSharing(@javax.annotation.Nullable final Boolean value) {
        this._iTunesBlockFileSharing = value;
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @param value Value to set for the iTunesBlockMusicService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesBlockMusicService(@javax.annotation.Nullable final Boolean value) {
        this._iTunesBlockMusicService = value;
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @param value Value to set for the keyboardBlockDictation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardBlockDictation(@javax.annotation.Nullable final Boolean value) {
        this._keyboardBlockDictation = value;
    }
    /**
     * Sets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @param value Value to set for the keychainBlockCloudSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeychainBlockCloudSync(@javax.annotation.Nullable final Boolean value) {
        this._keychainBlockCloudSync = value;
    }
    /**
     * Sets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the multiplayerGamingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiplayerGamingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._multiplayerGamingBlocked = value;
    }
    /**
     * Sets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @param value Value to set for the passwordBlockAirDropSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockAirDropSharing(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockAirDropSharing = value;
    }
    /**
     * Sets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @param value Value to set for the passwordBlockAutoFill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockAutoFill(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockAutoFill = value;
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockFingerprintUnlock(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @param value Value to set for the passwordBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockModification = value;
    }
    /**
     * Sets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @param value Value to set for the passwordBlockProximityRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockProximityRequests(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockProximityRequests = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @param value Value to set for the passwordMaximumAttemptCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMaximumAttemptCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMaximumAttemptCount = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @param value Value to set for the passwordMinutesUntilFailedLoginReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesUntilFailedLoginReset(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesUntilFailedLoginReset = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the privacyAccessControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAccessControls(@javax.annotation.Nullable final java.util.List<MacOSPrivacyAccessControlItem> value) {
        this._privacyAccessControls = value;
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @param value Value to set for the safariBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafariBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._safariBlockAutofill = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMajorOSDeferredInstallDelayInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateMajorOSDeferredInstallDelayInDays(@javax.annotation.Nullable final Integer value) {
        this._softwareUpdateMajorOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMinorOSDeferredInstallDelayInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateMinorOSDeferredInstallDelayInDays(@javax.annotation.Nullable final Integer value) {
        this._softwareUpdateMinorOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateNonOSDeferredInstallDelayInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateNonOSDeferredInstallDelayInDays(@javax.annotation.Nullable final Integer value) {
        this._softwareUpdateNonOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @param value Value to set for the softwareUpdatesEnforcedDelayInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdatesEnforcedDelayInDays(@javax.annotation.Nullable final Integer value) {
        this._softwareUpdatesEnforcedDelayInDays = value;
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @param value Value to set for the spotlightBlockInternetResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpotlightBlockInternetResults(@javax.annotation.Nullable final Boolean value) {
        this._spotlightBlockInternetResults = value;
    }
    /**
     * Sets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @param value Value to set for the touchIdTimeoutInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTouchIdTimeoutInHours(@javax.annotation.Nullable final Integer value) {
        this._touchIdTimeoutInHours = value;
    }
    /**
     * Sets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @param value Value to set for the updateDelayPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateDelayPolicy(@javax.annotation.Nullable final MacOSSoftwareUpdateDelayPolicy value) {
        this._updateDelayPolicy = value;
    }
    /**
     * Sets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the wallpaperModificationBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWallpaperModificationBlocked(@javax.annotation.Nullable final Boolean value) {
        this._wallpaperModificationBlocked = value;
    }
}
