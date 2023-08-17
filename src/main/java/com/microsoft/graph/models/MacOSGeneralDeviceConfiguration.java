package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the macOSGeneralDeviceConfiguration resource.
 */
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * When TRUE, activation lock is allowed when the devices is in the supervised mode. When FALSE, activation lock is not allowed. Default is false.
     */
    private Boolean activationLockWhenSupervisedAllowed;
    /**
     * Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     */
    private Boolean addingGameCenterFriendsBlocked;
    /**
     * Indicates whether or not to allow AirDrop.
     */
    private Boolean airDropBlocked;
    /**
     * Indicates whether or to block users from unlocking their Mac with Apple Watch.
     */
    private Boolean appleWatchBlockAutoUnlock;
    /**
     * Indicates whether or not to block the user from accessing the camera of the device.
     */
    private Boolean cameraBlocked;
    /**
     * Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    private Boolean classroomAppBlockRemoteScreenObservation;
    /**
     * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    private Boolean classroomAppForceUnpromptedScreenObservation;
    /**
     * Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    private Boolean classroomForceAutomaticallyJoinClasses;
    /**
     * Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    private Boolean classroomForceRequestPermissionToLeaveClasses;
    /**
     * Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     */
    private Boolean classroomForceUnpromptedAppAndDeviceLock;
    /**
     * Possible values of the compliance app list.
     */
    private AppListType compliantAppListType;
    /**
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    private java.util.List<AppListItem> compliantAppsList;
    /**
     * Indicates whether or not to allow content caching.
     */
    private Boolean contentCachingBlocked;
    /**
     * Indicates whether or not to block definition lookup.
     */
    private Boolean definitionLookupBlocked;
    /**
     * An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     */
    private java.util.List<String> emailInDomainSuffixes;
    /**
     * TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     */
    private Boolean eraseContentAndSettingsBlocked;
    /**
     * Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     */
    private Boolean gameCenterBlocked;
    /**
     * Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     */
    private Boolean iCloudBlockActivityContinuation;
    /**
     * Indicates whether or not to block iCloud from syncing contacts.
     */
    private Boolean iCloudBlockAddressBook;
    /**
     * Indicates whether or not to block iCloud from syncing bookmarks.
     */
    private Boolean iCloudBlockBookmarks;
    /**
     * Indicates whether or not to block iCloud from syncing calendars.
     */
    private Boolean iCloudBlockCalendar;
    /**
     * Indicates whether or not to block iCloud document sync.
     */
    private Boolean iCloudBlockDocumentSync;
    /**
     * Indicates whether or not to block iCloud from syncing mail.
     */
    private Boolean iCloudBlockMail;
    /**
     * Indicates whether or not to block iCloud from syncing notes.
     */
    private Boolean iCloudBlockNotes;
    /**
     * Indicates whether or not to block iCloud Photo Library.
     */
    private Boolean iCloudBlockPhotoLibrary;
    /**
     * Indicates whether or not to block iCloud from syncing reminders.
     */
    private Boolean iCloudBlockReminders;
    /**
     * When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     */
    private Boolean iCloudDesktopAndDocumentsBlocked;
    /**
     * iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     */
    private Boolean iCloudPrivateRelayBlocked;
    /**
     * Indicates whether or not to block files from being transferred using iTunes.
     */
    private Boolean iTunesBlockFileSharing;
    /**
     * Indicates whether or not to block Music service and revert Music app to classic mode.
     */
    private Boolean iTunesBlockMusicService;
    /**
     * Indicates whether or not to block the user from using dictation input.
     */
    private Boolean keyboardBlockDictation;
    /**
     * Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     */
    private Boolean keychainBlockCloudSync;
    /**
     * TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     */
    private Boolean multiplayerGamingBlocked;
    /**
     * Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     */
    private Boolean passwordBlockAirDropSharing;
    /**
     * Indicates whether or not to block the AutoFill Passwords feature.
     */
    private Boolean passwordBlockAutoFill;
    /**
     * Indicates whether or not to block fingerprint unlock.
     */
    private Boolean passwordBlockFingerprintUnlock;
    /**
     * Indicates whether or not to allow passcode modification.
     */
    private Boolean passwordBlockModification;
    /**
     * Indicates whether or not to block requesting passwords from nearby devices.
     */
    private Boolean passwordBlockProximityRequests;
    /**
     * Block simple passwords.
     */
    private Boolean passwordBlockSimple;
    /**
     * Number of days before the password expires.
     */
    private Integer passwordExpirationDays;
    /**
     * The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     */
    private Integer passwordMaximumAttemptCount;
    /**
     * Number of character sets a password must contain. Valid values 0 to 4
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * Minimum length of passwords.
     */
    private Integer passwordMinimumLength;
    /**
     * Minutes of inactivity required before a password is required.
     */
    private Integer passwordMinutesOfInactivityBeforeLock;
    /**
     * Minutes of inactivity required before the screen times out.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     */
    private Integer passwordMinutesUntilFailedLoginReset;
    /**
     * Number of previous passwords to block.
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Whether or not to require a password.
     */
    private Boolean passwordRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     */
    private java.util.List<MacOSPrivacyAccessControlItem> privacyAccessControls;
    /**
     * Indicates whether or not to block the user from using Auto fill in Safari.
     */
    private Boolean safariBlockAutofill;
    /**
     * Indicates whether or not to block the user from taking Screenshots.
     */
    private Boolean screenCaptureBlocked;
    /**
     * Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     */
    private Integer softwareUpdateMajorOSDeferredInstallDelayInDays;
    /**
     * Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     */
    private Integer softwareUpdateMinorOSDeferredInstallDelayInDays;
    /**
     * Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     */
    private Integer softwareUpdateNonOSDeferredInstallDelayInDays;
    /**
     * Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     */
    private Integer softwareUpdatesEnforcedDelayInDays;
    /**
     * Indicates whether or not to block Spotlight from returning any results from an Internet search.
     */
    private Boolean spotlightBlockInternetResults;
    /**
     * Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     */
    private Integer touchIdTimeoutInHours;
    /**
     * Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     */
    private MacOSSoftwareUpdateDelayPolicy updateDelayPolicy;
    /**
     * TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     */
    private Boolean wallpaperModificationBlocked;
    /**
     * Instantiates a new macOSGeneralDeviceConfiguration and sets the default values.
     */
    public MacOSGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSGeneralDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSGeneralDeviceConfiguration();
    }
    /**
     * Gets the activationLockWhenSupervisedAllowed property value. When TRUE, activation lock is allowed when the devices is in the supervised mode. When FALSE, activation lock is not allowed. Default is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActivationLockWhenSupervisedAllowed() {
        return this.activationLockWhenSupervisedAllowed;
    }
    /**
     * Gets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAddingGameCenterFriendsBlocked() {
        return this.addingGameCenterFriendsBlocked;
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this.airDropBlocked;
    }
    /**
     * Gets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchBlockAutoUnlock() {
        return this.appleWatchBlockAutoUnlock;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this.classroomAppBlockRemoteScreenObservation;
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this.classroomAppForceUnpromptedScreenObservation;
    }
    /**
     * Gets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceAutomaticallyJoinClasses() {
        return this.classroomForceAutomaticallyJoinClasses;
    }
    /**
     * Gets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceRequestPermissionToLeaveClasses() {
        return this.classroomForceRequestPermissionToLeaveClasses;
    }
    /**
     * Gets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceUnpromptedAppAndDeviceLock() {
        return this.classroomForceUnpromptedAppAndDeviceLock;
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a appListType
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.compliantAppListType;
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a appListItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.compliantAppsList;
    }
    /**
     * Gets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentCachingBlocked() {
        return this.contentCachingBlocked;
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this.definitionLookupBlocked;
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this.emailInDomainSuffixes;
    }
    /**
     * Gets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEraseContentAndSettingsBlocked() {
        return this.eraseContentAndSettingsBlocked;
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
        deserializerMap.put("updateDelayPolicy", (n) -> { this.setUpdateDelayPolicy(n.getEnumValue(MacOSSoftwareUpdateDelayPolicy.class)); });
        deserializerMap.put("wallpaperModificationBlocked", (n) -> { this.setWallpaperModificationBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this.gameCenterBlocked;
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this.iCloudBlockActivityContinuation;
    }
    /**
     * Gets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockAddressBook() {
        return this.iCloudBlockAddressBook;
    }
    /**
     * Gets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockBookmarks() {
        return this.iCloudBlockBookmarks;
    }
    /**
     * Gets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockCalendar() {
        return this.iCloudBlockCalendar;
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this.iCloudBlockDocumentSync;
    }
    /**
     * Gets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockMail() {
        return this.iCloudBlockMail;
    }
    /**
     * Gets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockNotes() {
        return this.iCloudBlockNotes;
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this.iCloudBlockPhotoLibrary;
    }
    /**
     * Gets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockReminders() {
        return this.iCloudBlockReminders;
    }
    /**
     * Gets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudDesktopAndDocumentsBlocked() {
        return this.iCloudDesktopAndDocumentsBlocked;
    }
    /**
     * Gets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudPrivateRelayBlocked() {
        return this.iCloudPrivateRelayBlocked;
    }
    /**
     * Gets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockFileSharing() {
        return this.iTunesBlockFileSharing;
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this.iTunesBlockMusicService;
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this.keyboardBlockDictation;
    }
    /**
     * Gets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeychainBlockCloudSync() {
        return this.keychainBlockCloudSync;
    }
    /**
     * Gets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMultiplayerGamingBlocked() {
        return this.multiplayerGamingBlocked;
    }
    /**
     * Gets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAirDropSharing() {
        return this.passwordBlockAirDropSharing;
    }
    /**
     * Gets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAutoFill() {
        return this.passwordBlockAutoFill;
    }
    /**
     * Gets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockFingerprintUnlock() {
        return this.passwordBlockFingerprintUnlock;
    }
    /**
     * Gets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockModification() {
        return this.passwordBlockModification;
    }
    /**
     * Gets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockProximityRequests() {
        return this.passwordBlockProximityRequests;
    }
    /**
     * Gets the passwordBlockSimple property value. Block simple passwords.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMaximumAttemptCount() {
        return this.passwordMaximumAttemptCount;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of passwords.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesUntilFailedLoginReset() {
        return this.passwordMinutesUntilFailedLoginReset;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @return a macOSPrivacyAccessControlItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSPrivacyAccessControlItem> getPrivacyAccessControls() {
        return this.privacyAccessControls;
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this.safariBlockAutofill;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateMajorOSDeferredInstallDelayInDays() {
        return this.softwareUpdateMajorOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateMinorOSDeferredInstallDelayInDays() {
        return this.softwareUpdateMinorOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdateNonOSDeferredInstallDelayInDays() {
        return this.softwareUpdateNonOSDeferredInstallDelayInDays;
    }
    /**
     * Gets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdatesEnforcedDelayInDays() {
        return this.softwareUpdatesEnforcedDelayInDays;
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this.spotlightBlockInternetResults;
    }
    /**
     * Gets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTouchIdTimeoutInHours() {
        return this.touchIdTimeoutInHours;
    }
    /**
     * Gets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @return a macOSSoftwareUpdateDelayPolicy
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateDelayPolicy getUpdateDelayPolicy() {
        return this.updateDelayPolicy;
    }
    /**
     * Gets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWallpaperModificationBlocked() {
        return this.wallpaperModificationBlocked;
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
        writer.writeEnumValue("updateDelayPolicy", this.getUpdateDelayPolicy());
        writer.writeBooleanValue("wallpaperModificationBlocked", this.getWallpaperModificationBlocked());
    }
    /**
     * Sets the activationLockWhenSupervisedAllowed property value. When TRUE, activation lock is allowed when the devices is in the supervised mode. When FALSE, activation lock is not allowed. Default is false.
     * @param value Value to set for the activationLockWhenSupervisedAllowed property.
     */
    public void setActivationLockWhenSupervisedAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.activationLockWhenSupervisedAllowed = value;
    }
    /**
     * Sets the addingGameCenterFriendsBlocked property value. Yes prevents users from adding friends to Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the addingGameCenterFriendsBlocked property.
     */
    public void setAddingGameCenterFriendsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.addingGameCenterFriendsBlocked = value;
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop.
     * @param value Value to set for the airDropBlocked property.
     */
    public void setAirDropBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.airDropBlocked = value;
    }
    /**
     * Sets the appleWatchBlockAutoUnlock property value. Indicates whether or to block users from unlocking their Mac with Apple Watch.
     * @param value Value to set for the appleWatchBlockAutoUnlock property.
     */
    public void setAppleWatchBlockAutoUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.appleWatchBlockAutoUnlock = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     */
    public void setClassroomAppBlockRemoteScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.classroomAppBlockRemoteScreenObservation = value;
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     */
    public void setClassroomAppForceUnpromptedScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.classroomAppForceUnpromptedScreenObservation = value;
    }
    /**
     * Sets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceAutomaticallyJoinClasses property.
     */
    public void setClassroomForceAutomaticallyJoinClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.classroomForceAutomaticallyJoinClasses = value;
    }
    /**
     * Sets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceRequestPermissionToLeaveClasses property.
     */
    public void setClassroomForceRequestPermissionToLeaveClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.classroomForceRequestPermissionToLeaveClasses = value;
    }
    /**
     * Sets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.
     * @param value Value to set for the classroomForceUnpromptedAppAndDeviceLock property.
     */
    public void setClassroomForceUnpromptedAppAndDeviceLock(@jakarta.annotation.Nullable final Boolean value) {
        this.classroomForceUnpromptedAppAndDeviceLock = value;
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.compliantAppListType = value;
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.compliantAppsList = value;
    }
    /**
     * Sets the contentCachingBlocked property value. Indicates whether or not to allow content caching.
     * @param value Value to set for the contentCachingBlocked property.
     */
    public void setContentCachingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.contentCachingBlocked = value;
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup.
     * @param value Value to set for the definitionLookupBlocked property.
     */
    public void setDefinitionLookupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.definitionLookupBlocked = value;
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     */
    public void setEmailInDomainSuffixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.emailInDomainSuffixes = value;
    }
    /**
     * Sets the eraseContentAndSettingsBlocked property value. TRUE disables the reset option on supervised devices. FALSE enables the reset option on supervised devices. Available for devices running macOS versions 12.0 and later.
     * @param value Value to set for the eraseContentAndSettingsBlocked property.
     */
    public void setEraseContentAndSettingsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.eraseContentAndSettingsBlocked = value;
    }
    /**
     * Sets the gameCenterBlocked property value. Yes disables Game Center, and the Game Center icon is removed from the Home screen. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the gameCenterBlocked property.
     */
    public void setGameCenterBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.gameCenterBlocked = value;
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     */
    public void setICloudBlockActivityContinuation(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockActivityContinuation = value;
    }
    /**
     * Sets the iCloudBlockAddressBook property value. Indicates whether or not to block iCloud from syncing contacts.
     * @param value Value to set for the iCloudBlockAddressBook property.
     */
    public void setICloudBlockAddressBook(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockAddressBook = value;
    }
    /**
     * Sets the iCloudBlockBookmarks property value. Indicates whether or not to block iCloud from syncing bookmarks.
     * @param value Value to set for the iCloudBlockBookmarks property.
     */
    public void setICloudBlockBookmarks(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockBookmarks = value;
    }
    /**
     * Sets the iCloudBlockCalendar property value. Indicates whether or not to block iCloud from syncing calendars.
     * @param value Value to set for the iCloudBlockCalendar property.
     */
    public void setICloudBlockCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockCalendar = value;
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     */
    public void setICloudBlockDocumentSync(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockDocumentSync = value;
    }
    /**
     * Sets the iCloudBlockMail property value. Indicates whether or not to block iCloud from syncing mail.
     * @param value Value to set for the iCloudBlockMail property.
     */
    public void setICloudBlockMail(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockMail = value;
    }
    /**
     * Sets the iCloudBlockNotes property value. Indicates whether or not to block iCloud from syncing notes.
     * @param value Value to set for the iCloudBlockNotes property.
     */
    public void setICloudBlockNotes(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockNotes = value;
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     */
    public void setICloudBlockPhotoLibrary(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockPhotoLibrary = value;
    }
    /**
     * Sets the iCloudBlockReminders property value. Indicates whether or not to block iCloud from syncing reminders.
     * @param value Value to set for the iCloudBlockReminders property.
     */
    public void setICloudBlockReminders(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudBlockReminders = value;
    }
    /**
     * Sets the iCloudDesktopAndDocumentsBlocked property value. When TRUE the synchronization of cloud desktop and documents is blocked. When FALSE, synchronization of the cloud desktop and documents are allowed. Available for devices running macOS 10.12.4 and later.
     * @param value Value to set for the iCloudDesktopAndDocumentsBlocked property.
     */
    public void setICloudDesktopAndDocumentsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudDesktopAndDocumentsBlocked = value;
    }
    /**
     * Sets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running macOS 12 and later.
     * @param value Value to set for the iCloudPrivateRelayBlocked property.
     */
    public void setICloudPrivateRelayBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.iCloudPrivateRelayBlocked = value;
    }
    /**
     * Sets the iTunesBlockFileSharing property value. Indicates whether or not to block files from being transferred using iTunes.
     * @param value Value to set for the iTunesBlockFileSharing property.
     */
    public void setITunesBlockFileSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.iTunesBlockFileSharing = value;
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode.
     * @param value Value to set for the iTunesBlockMusicService property.
     */
    public void setITunesBlockMusicService(@jakarta.annotation.Nullable final Boolean value) {
        this.iTunesBlockMusicService = value;
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input.
     * @param value Value to set for the keyboardBlockDictation property.
     */
    public void setKeyboardBlockDictation(@jakarta.annotation.Nullable final Boolean value) {
        this.keyboardBlockDictation = value;
    }
    /**
     * Sets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).
     * @param value Value to set for the keychainBlockCloudSync property.
     */
    public void setKeychainBlockCloudSync(@jakarta.annotation.Nullable final Boolean value) {
        this.keychainBlockCloudSync = value;
    }
    /**
     * Sets the multiplayerGamingBlocked property value. TRUE prevents multiplayer gaming when using Game Center. FALSE allows multiplayer gaming when using Game Center. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the multiplayerGamingBlocked property.
     */
    public void setMultiplayerGamingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.multiplayerGamingBlocked = value;
    }
    /**
     * Sets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature.
     * @param value Value to set for the passwordBlockAirDropSharing property.
     */
    public void setPasswordBlockAirDropSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockAirDropSharing = value;
    }
    /**
     * Sets the passwordBlockAutoFill property value. Indicates whether or not to block the AutoFill Passwords feature.
     * @param value Value to set for the passwordBlockAutoFill property.
     */
    public void setPasswordBlockAutoFill(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockAutoFill = value;
    }
    /**
     * Sets the passwordBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passwordBlockFingerprintUnlock property.
     */
    public void setPasswordBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockFingerprintUnlock = value;
    }
    /**
     * Sets the passwordBlockModification property value. Indicates whether or not to allow passcode modification.
     * @param value Value to set for the passwordBlockModification property.
     */
    public void setPasswordBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockModification = value;
    }
    /**
     * Sets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices.
     * @param value Value to set for the passwordBlockProximityRequests property.
     */
    public void setPasswordBlockProximityRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockProximityRequests = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMaximumAttemptCount property value. The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11
     * @param value Value to set for the passwordMaximumAttemptCount property.
     */
    public void setPasswordMaximumAttemptCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMaximumAttemptCount = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. Number of character sets a password must contain. Valid values 0 to 4
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of passwords.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity required before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity required before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordMinutesUntilFailedLoginReset property value. The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.
     * @param value Value to set for the passwordMinutesUntilFailedLoginReset property.
     */
    public void setPasswordMinutesUntilFailedLoginReset(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesUntilFailedLoginReset = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the privacyAccessControls property value. List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the privacyAccessControls property.
     */
    public void setPrivacyAccessControls(@jakarta.annotation.Nullable final java.util.List<MacOSPrivacyAccessControlItem> value) {
        this.privacyAccessControls = value;
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari.
     * @param value Value to set for the safariBlockAutofill property.
     */
    public void setSafariBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.safariBlockAutofill = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the softwareUpdateMajorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of major OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMajorOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateMajorOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.softwareUpdateMajorOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdateMinorOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of minor OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateMinorOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateMinorOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.softwareUpdateMinorOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdateNonOSDeferredInstallDelayInDays property value. Specify the number of days (1-90) to delay visibility of non-OS software updates. Available for devices running macOS versions 11.3 and later. Valid values 0 to 90
     * @param value Value to set for the softwareUpdateNonOSDeferredInstallDelayInDays property.
     */
    public void setSoftwareUpdateNonOSDeferredInstallDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.softwareUpdateNonOSDeferredInstallDelayInDays = value;
    }
    /**
     * Sets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @param value Value to set for the softwareUpdatesEnforcedDelayInDays property.
     */
    public void setSoftwareUpdatesEnforcedDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.softwareUpdatesEnforcedDelayInDays = value;
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight from returning any results from an Internet search.
     * @param value Value to set for the spotlightBlockInternetResults property.
     */
    public void setSpotlightBlockInternetResults(@jakarta.annotation.Nullable final Boolean value) {
        this.spotlightBlockInternetResults = value;
    }
    /**
     * Sets the touchIdTimeoutInHours property value. Maximum hours after which the user must enter their password to unlock the device instead of using Touch ID. Available for devices running macOS 12 and later. Valid values 0 to 2147483647
     * @param value Value to set for the touchIdTimeoutInHours property.
     */
    public void setTouchIdTimeoutInHours(@jakarta.annotation.Nullable final Integer value) {
        this.touchIdTimeoutInHours = value;
    }
    /**
     * Sets the updateDelayPolicy property value. Determines whether to delay OS and/or app updates for macOS. Possible values are: none, delayOSUpdateVisibility, delayAppUpdateVisibility, unknownFutureValue, delayMajorOsUpdateVisibility.
     * @param value Value to set for the updateDelayPolicy property.
     */
    public void setUpdateDelayPolicy(@jakarta.annotation.Nullable final MacOSSoftwareUpdateDelayPolicy value) {
        this.updateDelayPolicy = value;
    }
    /**
     * Sets the wallpaperModificationBlocked property value. TRUE prevents the wallpaper from being changed. FALSE allows the wallpaper to be changed. Available for devices running macOS versions 10.13 and later.
     * @param value Value to set for the wallpaperModificationBlocked property.
     */
    public void setWallpaperModificationBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.wallpaperModificationBlocked = value;
    }
}
