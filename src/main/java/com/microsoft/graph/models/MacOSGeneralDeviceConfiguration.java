package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the macOSGeneralDeviceConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new MacOSGeneralDeviceConfiguration and sets the default values.
     */
    public MacOSGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSGeneralDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSGeneralDeviceConfiguration();
    }
    /**
     * Gets the activationLockWhenSupervisedAllowed property value. When TRUE, activation lock is allowed when the devices is in the supervised mode. When FALSE, activation lock is not allowed. Default is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActivationLockWhenSupervisedAllowed() {
        return this.backingStore.get("activationLockWhenSupervisedAllowed");
    }
    /**
     * Gets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAddingGameCenterFriendsBlocked() {
        return this.backingStore.get("addingGameCenterFriendsBlocked");
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this.backingStore.get("airDropBlocked");
    }
    /**
     * Gets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchBlockAutoUnlock() {
        return this.backingStore.get("appleWatchBlockAutoUnlock");
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.backingStore.get("cameraBlocked");
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this.backingStore.get("classroomAppBlockRemoteScreenObservation");
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this.backingStore.get("classroomAppForceUnpromptedScreenObservation");
    }
    /**
     * Gets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceAutomaticallyJoinClasses() {
        return this.backingStore.get("classroomForceAutomaticallyJoinClasses");
    }
    /**
     * Gets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceRequestPermissionToLeaveClasses() {
        return this.backingStore.get("classroomForceRequestPermissionToLeaveClasses");
    }
    /**
     * Gets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceUnpromptedAppAndDeviceLock() {
        return this.backingStore.get("classroomForceUnpromptedAppAndDeviceLock");
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a AppListType
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.backingStore.get("compliantAppListType");
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.backingStore.get("compliantAppsList");
    }
    /**
     * Gets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingBlocked() {
        return this.backingStore.get("contentCachingBlocked");
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this.backingStore.get("definitionLookupBlocked");
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this.backingStore.get("emailInDomainSuffixes");
    }
    /**
     * Gets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEraseContentAndSettingsBlocked() {
        return this.backingStore.get("eraseContentAndSettingsBlocked");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationLockWhenSupervisedAllowed", (n) -> { this.setActivationLockWhenSupervisedAllowed(n.getBooleanValue()); });
        deserializerMap.put("addingGameCenterFriendsBlocked", (n) -> { this.setAddingGameCenterFriendsBlocked(n.getBooleanValue()); });
        deserializerMap.put("airDropBlocked", (n) -> { this.setAirDropBlocked(n.getBooleanValue()); });
        deserializerMap.put("appleWatchBlockAutoUnlock", (n) -> { this.setAppleWatchBlockAutoUnlock(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("classroomAppBlockRemoteScreenObservation", (n) -> { this.setClassroomAppBlockRemoteScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomAppForceUnpromptedScreenObservation", (n) -> { this.setClassroomAppForceUnpromptedScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomForceAutomaticallyJoinClasses", (n) -> { this.setClassroomForceAutomaticallyJoinClasses(n.getBooleanValue()); });
        deserializerMap.put("classroomForceRequestPermissionToLeaveClasses", (n) -> { this.setClassroomForceRequestPermissionToLeaveClasses(n.getBooleanValue()); });
        deserializerMap.put("classroomForceUnpromptedAppAndDeviceLock", (n) -> { this.setClassroomForceUnpromptedAppAndDeviceLock(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCachingBlocked", (n) -> { this.setContentCachingBlocked(n.getBooleanValue()); });
        deserializerMap.put("definitionLookupBlocked", (n) -> { this.setDefinitionLookupBlocked(n.getBooleanValue()); });
        deserializerMap.put("emailInDomainSuffixes", (n) -> { this.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("eraseContentAndSettingsBlocked", (n) -> { this.setEraseContentAndSettingsBlocked(n.getBooleanValue()); });
        deserializerMap.put("gameCenterBlocked", (n) -> { this.setGameCenterBlocked(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockActivityContinuation", (n) -> { this.setICloudBlockActivityContinuation(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockAddressBook", (n) -> { this.setICloudBlockAddressBook(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockBookmarks", (n) -> { this.setICloudBlockBookmarks(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockCalendar", (n) -> { this.setICloudBlockCalendar(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockDocumentSync", (n) -> { this.setICloudBlockDocumentSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockMail", (n) -> { this.setICloudBlockMail(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockNotes", (n) -> { this.setICloudBlockNotes(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoLibrary", (n) -> { this.setICloudBlockPhotoLibrary(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockReminders", (n) -> { this.setICloudBlockReminders(n.getBooleanValue()); });
        deserializerMap.put("iCloudDesktopAndDocumentsBlocked", (n) -> { this.setICloudDesktopAndDocumentsBlocked(n.getBooleanValue()); });
        deserializerMap.put("iCloudPrivateRelayBlocked", (n) -> { this.setICloudPrivateRelayBlocked(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockFileSharing", (n) -> { this.setITunesBlockFileSharing(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockMusicService", (n) -> { this.setITunesBlockMusicService(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockDictation", (n) -> { this.setKeyboardBlockDictation(n.getBooleanValue()); });
        deserializerMap.put("keychainBlockCloudSync", (n) -> { this.setKeychainBlockCloudSync(n.getBooleanValue()); });
        deserializerMap.put("multiplayerGamingBlocked", (n) -> { this.setMultiplayerGamingBlocked(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockAirDropSharing", (n) -> { this.setPasswordBlockAirDropSharing(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockAutoFill", (n) -> { this.setPasswordBlockAutoFill(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockFingerprintUnlock", (n) -> { this.setPasswordBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockModification", (n) -> { this.setPasswordBlockModification(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockProximityRequests", (n) -> { this.setPasswordBlockProximityRequests(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMaximumAttemptCount", (n) -> { this.setPasswordMaximumAttemptCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesUntilFailedLoginReset", (n) -> { this.setPasswordMinutesUntilFailedLoginReset(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("privacyAccessControls", (n) -> { this.setPrivacyAccessControls(n.getCollectionOfObjectValues(MacOSPrivacyAccessControlItem::createFromDiscriminatorValue)); });
        deserializerMap.put("safariBlockAutofill", (n) -> { this.setSafariBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("softwareUpdateMajorOSDeferredInstallDelayInDays", (n) -> { this.setSoftwareUpdateMajorOSDeferredInstallDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("softwareUpdateMinorOSDeferredInstallDelayInDays", (n) -> { this.setSoftwareUpdateMinorOSDeferredInstallDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("softwareUpdateNonOSDeferredInstallDelayInDays", (n) -> { this.setSoftwareUpdateNonOSDeferredInstallDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("softwareUpdatesEnforcedDelayInDays", (n) -> { this.setSoftwareUpdatesEnforcedDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("spotlightBlockInternetResults", (n) -> { this.setSpotlightBlockInternetResults(n.getBooleanValue()); });
        deserializerMap.put("touchIdTimeoutInHours", (n) -> { this.setTouchIdTimeoutInHours(n.getIntegerValue()); });
        deserializerMap.put("updateDelayPolicy", (n) -> { this.setUpdateDelayPolicy(n.getEnumSetValue(MacOSSoftwareUpdateDelayPolicy.class)); });
        deserializerMap.put("wallpaperModificationBlocked", (n) -> { this.setWallpaperModificationBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this.backingStore.get("gameCenterBlocked");
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this.backingStore.get("iCloudBlockActivityContinuation");
    }
    /**
     * Gets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockAddressBook() {
        return this.backingStore.get("iCloudBlockAddressBook");
    }
    /**
     * Gets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockBookmarks() {
        return this.backingStore.get("iCloudBlockBookmarks");
    }
    /**
     * Gets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockCalendar() {
        return this.backingStore.get("iCloudBlockCalendar");
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this.backingStore.get("iCloudBlockDocumentSync");
    }
    /**
     * Gets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockMail() {
        return this.backingStore.get("iCloudBlockMail");
    }
    /**
     * Gets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockNotes() {
        return this.backingStore.get("iCloudBlockNotes");
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this.backingStore.get("iCloudBlockPhotoLibrary");
    }
    /**
     * Gets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockReminders() {
        return this.backingStore.get("iCloudBlockReminders");
    }
    /**
     * Gets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudDesktopAndDocumentsBlocked() {
        return this.backingStore.get("iCloudDesktopAndDocumentsBlocked");
    }
    /**
     * Gets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudPrivateRelayBlocked() {
        return this.backingStore.get("iCloudPrivateRelayBlocked");
    }
    /**
     * Gets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockFileSharing() {
        return this.backingStore.get("iTunesBlockFileSharing");
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this.backingStore.get("iTunesBlockMusicService");
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this.backingStore.get("keyboardBlockDictation");
    }
    /**
     * Gets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeychainBlockCloudSync() {
        return this.backingStore.get("keychainBlockCloudSync");
    }
    /**
     * Gets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMultiplayerGamingBlocked() {
        return this.backingStore.get("multiplayerGamingBlocked");
    }
    /**
     * Gets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAirDropSharing() {
        return this.backingStore.get("passwordBlockAirDropSharing");
    }
    /**
     * Gets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAutoFill() {
        return this.backingStore.get("passwordBlockAutoFill");
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this.backingStore.get("passwordBlockFingerprintUnlock");
    }
    /**
     * Gets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this.backingStore.get("passwordBlockModification");
    }
    /**
     * Gets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockProximityRequests() {
        return this.backingStore.get("passwordBlockProximityRequests");
    }
    /**
     * Gets the passwordBlockSimple property value. Block simple passwords.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.backingStore.get("passwordBlockSimple");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMaximumAttemptCount() {
        return this.backingStore.get("passwordMaximumAttemptCount");
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.backingStore.get("passwordMinimumCharacterSetCount");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesUntilFailedLoginReset() {
        return this.backingStore.get("passwordMinutesUntilFailedLoginReset");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<MacOSPrivacyAccessControlItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSPrivacyAccessControlItem> getPrivacyAccessControls() {
        return this.backingStore.get("privacyAccessControls");
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this.backingStore.get("safariBlockAutofill");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
    }
    /**
     * Gets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateMajorOSDeferredInstallDelayInDays() {
        return this.backingStore.get("softwareUpdateMajorOSDeferredInstallDelayInDays");
    }
    /**
     * Gets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateMinorOSDeferredInstallDelayInDays() {
        return this.backingStore.get("softwareUpdateMinorOSDeferredInstallDelayInDays");
    }
    /**
     * Gets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateNonOSDeferredInstallDelayInDays() {
        return this.backingStore.get("softwareUpdateNonOSDeferredInstallDelayInDays");
    }
    /**
     * Gets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdatesEnforcedDelayInDays() {
        return this.backingStore.get("softwareUpdatesEnforcedDelayInDays");
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this.backingStore.get("spotlightBlockInternetResults");
    }
    /**
     * Gets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTouchIdTimeoutInHours() {
        return this.backingStore.get("touchIdTimeoutInHours");
    }
    /**
     * Gets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @return a EnumSet<MacOSSoftwareUpdateDelayPolicy>
     */
    @jakarta.annotation.Nullable
    public EnumSet<MacOSSoftwareUpdateDelayPolicy> getUpdateDelayPolicy() {
        return this.backingStore.get("updateDelayPolicy");
    }
    /**
     * Gets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWallpaperModificationBlocked() {
        return this.backingStore.get("wallpaperModificationBlocked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("activationLockWhenSupervisedAllowed", this.getActivationLockWhenSupervisedAllowed());
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
        writer.writeEnumSetValue("updateDelayPolicy", this.getUpdateDelayPolicy());
        writer.writeBooleanValue("wallpaperModificationBlocked", this.getWallpaperModificationBlocked());
    }
    /**
     * Sets the activationLockWhenSupervisedAllowed property value. When TRUE, activation lock is allowed when the devices is in the supervised mode. When FALSE, activation lock is not allowed. Default is false.
     * @param value Value to set for the activationLockWhenSupervisedAllowed property.
     */
    public void setActivationLockWhenSupervisedAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("activationLockWhenSupervisedAllowed", value);
    }
    /**
     * Sets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the addingGameCenterFriendsBlocked property.
     */
    public void setAddingGameCenterFriendsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("addingGameCenterFriendsBlocked", value);
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @param value Value to set for the airDropBlocked property.
     */
    public void setAirDropBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("airDropBlocked", value);
    }
    /**
     * Sets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @param value Value to set for the appleWatchBlockAutoUnlock property.
     */
    public void setAppleWatchBlockAutoUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appleWatchBlockAutoUnlock", value);
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cameraBlocked", value);
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     */
    public void setClassroomAppBlockRemoteScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("classroomAppBlockRemoteScreenObservation", value);
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     */
    public void setClassroomAppForceUnpromptedScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("classroomAppForceUnpromptedScreenObservation", value);
    }
    /**
     * Sets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceAutomaticallyJoinClasses property.
     */
    public void setClassroomForceAutomaticallyJoinClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("classroomForceAutomaticallyJoinClasses", value);
    }
    /**
     * Sets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceRequestPermissionToLeaveClasses property.
     */
    public void setClassroomForceRequestPermissionToLeaveClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("classroomForceRequestPermissionToLeaveClasses", value);
    }
    /**
     * Sets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceUnpromptedAppAndDeviceLock property.
     */
    public void setClassroomForceUnpromptedAppAndDeviceLock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("classroomForceUnpromptedAppAndDeviceLock", value);
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.backingStore.set("compliantAppListType", value);
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("compliantAppsList", value);
    }
    /**
     * Sets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @param value Value to set for the contentCachingBlocked property.
     */
    public void setContentCachingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("contentCachingBlocked", value);
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @param value Value to set for the definitionLookupBlocked property.
     */
    public void setDefinitionLookupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("definitionLookupBlocked", value);
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     */
    public void setEmailInDomainSuffixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("emailInDomainSuffixes", value);
    }
    /**
     * Sets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @param value Value to set for the eraseContentAndSettingsBlocked property.
     */
    public void setEraseContentAndSettingsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("eraseContentAndSettingsBlocked", value);
    }
    /**
     * Sets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the gameCenterBlocked property.
     */
    public void setGameCenterBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gameCenterBlocked", value);
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     */
    public void setICloudBlockActivityContinuation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockActivityContinuation", value);
    }
    /**
     * Sets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @param value Value to set for the iCloudBlockAddressBook property.
     */
    public void setICloudBlockAddressBook(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockAddressBook", value);
    }
    /**
     * Sets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @param value Value to set for the iCloudBlockBookmarks property.
     */
    public void setICloudBlockBookmarks(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockBookmarks", value);
    }
    /**
     * Sets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @param value Value to set for the iCloudBlockCalendar property.
     */
    public void setICloudBlockCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockCalendar", value);
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     */
    public void setICloudBlockDocumentSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockDocumentSync", value);
    }
    /**
     * Sets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @param value Value to set for the iCloudBlockMail property.
     */
    public void setICloudBlockMail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockMail", value);
    }
    /**
     * Sets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @param value Value to set for the iCloudBlockNotes property.
     */
    public void setICloudBlockNotes(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockNotes", value);
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     */
    public void setICloudBlockPhotoLibrary(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockPhotoLibrary", value);
    }
    /**
     * Sets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @param value Value to set for the iCloudBlockReminders property.
     */
    public void setICloudBlockReminders(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudBlockReminders", value);
    }
    /**
     * Sets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @param value Value to set for the iCloudDesktopAndDocumentsBlocked property.
     */
    public void setICloudDesktopAndDocumentsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudDesktopAndDocumentsBlocked", value);
    }
    /**
     * Sets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @param value Value to set for the iCloudPrivateRelayBlocked property.
     */
    public void setICloudPrivateRelayBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudPrivateRelayBlocked", value);
    }
    /**
     * Sets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @param value Value to set for the iTunesBlockFileSharing property.
     */
    public void setITunesBlockFileSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iTunesBlockFileSharing", value);
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @param value Value to set for the iTunesBlockMusicService property.
     */
    public void setITunesBlockMusicService(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iTunesBlockMusicService", value);
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @param value Value to set for the keyboardBlockDictation property.
     */
    public void setKeyboardBlockDictation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keyboardBlockDictation", value);
    }
    /**
     * Sets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @param value Value to set for the keychainBlockCloudSync property.
     */
    public void setKeychainBlockCloudSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keychainBlockCloudSync", value);
    }
    /**
     * Sets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the multiplayerGamingBlocked property.
     */
    public void setMultiplayerGamingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("multiplayerGamingBlocked", value);
    }
    /**
     * Sets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @param value Value to set for the passwordBlockAirDropSharing property.
     */
    public void setPasswordBlockAirDropSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockAirDropSharing", value);
    }
    /**
     * Sets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @param value Value to set for the passwordBlockAutoFill property.
     */
    public void setPasswordBlockAutoFill(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockAutoFill", value);
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     */
    public void setPasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockFingerprintUnlock", value);
    }
    /**
     * Sets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @param value Value to set for the passwordBlockModification property.
     */
    public void setPasswordBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockModification", value);
    }
    /**
     * Sets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @param value Value to set for the passwordBlockProximityRequests property.
     */
    public void setPasswordBlockProximityRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockProximityRequests", value);
    }
    /**
     * Sets the passwordBlockSimple property value. Block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockSimple", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @param value Value to set for the passwordMaximumAttemptCount property.
     */
    public void setPasswordMaximumAttemptCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMaximumAttemptCount", value);
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @param value Value to set for the passwordMinutesUntilFailedLoginReset property.
     */
    public void setPasswordMinutesUntilFailedLoginReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesUntilFailedLoginReset", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the privacyAccessControls property.
     */
    public void setPrivacyAccessControls(@jakarta.annotation.Nullable final java.util.List<MacOSPrivacyAccessControlItem> value) {
        this.backingStore.set("privacyAccessControls", value);
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @param value Value to set for the safariBlockAutofill property.
     */
    public void setSafariBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("safariBlockAutofill", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMajorOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateMajorOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("softwareUpdateMajorOSDeferredInstallDelayInDays", value);
    }
    /**
     * Sets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMinorOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateMinorOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("softwareUpdateMinorOSDeferredInstallDelayInDays", value);
    }
    /**
     * Sets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateNonOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateNonOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("softwareUpdateNonOSDeferredInstallDelayInDays", value);
    }
    /**
     * Sets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @param value Value to set for the softwareUpdatesEnforcedDelayInDays property.
     */
    public void setSoftwareUpdatesEnforcedDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("softwareUpdatesEnforcedDelayInDays", value);
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @param value Value to set for the spotlightBlockInternetResults property.
     */
    public void setSpotlightBlockInternetResults(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("spotlightBlockInternetResults", value);
    }
    /**
     * Sets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @param value Value to set for the touchIdTimeoutInHours property.
     */
    public void setTouchIdTimeoutInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("touchIdTimeoutInHours", value);
    }
    /**
     * Sets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @param value Value to set for the updateDelayPolicy property.
     */
    public void setUpdateDelayPolicy(@jakarta.annotation.Nullable final EnumSet<MacOSSoftwareUpdateDelayPolicy> value) {
        this.backingStore.set("updateDelayPolicy", value);
    }
    /**
     * Sets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the wallpaperModificationBlocked property.
     */
    public void setWallpaperModificationBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wallpaperModificationBlocked", value);
    }
}
