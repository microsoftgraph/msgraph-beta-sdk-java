package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements Parsable {
    /** Allow eligible Windows 10 devices to upgrade to the latest version of Windows 11. */
    private Boolean _allowWindows11Upgrade;
    /** Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault. */
    private AutomaticUpdateMode _automaticUpdateMode;
    /** Specify the method by which the auto-restart required notification is dismissed. Possible values are: notConfigured, automatic, user. */
    private AutoRestartNotificationDismissalMethod _autoRestartNotificationDismissal;
    /** Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease. */
    private WindowsUpdateType _businessReadyUpdatesOnly;
    /** Number of days before feature updates are installed automatically with valid range from 0 to 30 days */
    private Integer _deadlineForFeatureUpdatesInDays;
    /** Number of days before quality updates are installed automatically with valid range from 0 to 30 days */
    private Integer _deadlineForQualityUpdatesInDays;
    /** Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days */
    private Integer _deadlineGracePeriodInDays;
    /** Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode. */
    private WindowsDeliveryOptimizationMode _deliveryOptimizationMode;
    /** Windows update for business configuration device states. This collection can contain a maximum of 500 elements. */
    private java.util.List<WindowsUpdateState> _deviceUpdateStates;
    /** Exclude Windows update Drivers */
    private Boolean _driversExcluded;
    /** Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days */
    private Integer _engagedRestartDeadlineInDays;
    /** Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days */
    private Integer _engagedRestartSnoozeScheduleInDays;
    /** Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days */
    private Integer _engagedRestartTransitionScheduleInDays;
    /** Defer Feature Updates by these many days */
    private Integer _featureUpdatesDeferralPeriodInDays;
    /** Pause Feature Updates */
    private Boolean _featureUpdatesPaused;
    /** Feature Updates Pause Expiry datetime */
    private OffsetDateTime _featureUpdatesPauseExpiryDateTime;
    /** Feature Updates Pause start date. This property is read-only. */
    private LocalDate _featureUpdatesPauseStartDate;
    /** Feature Updates Rollback Start datetime */
    private OffsetDateTime _featureUpdatesRollbackStartDateTime;
    /** The number of days after a Feature Update for which a rollback is valid */
    private Integer _featureUpdatesRollbackWindowInDays;
    /** Specifies whether to rollback Feature Updates on the next device check in */
    private Boolean _featureUpdatesWillBeRolledBack;
    /** Installation schedule */
    private WindowsUpdateInstallScheduleType _installationSchedule;
    /** Allow Microsoft Update Service */
    private Boolean _microsoftUpdateServiceAllowed;
    /** Specifies if the device should wait until deadline for rebooting outside of active hours */
    private Boolean _postponeRebootUntilAfterDeadline;
    /** The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed. */
    private PrereleaseFeatures _prereleaseFeatures;
    /** Defer Quality Updates by these many days */
    private Integer _qualityUpdatesDeferralPeriodInDays;
    /** Pause Quality Updates */
    private Boolean _qualityUpdatesPaused;
    /** Quality Updates Pause Expiry datetime */
    private OffsetDateTime _qualityUpdatesPauseExpiryDateTime;
    /** Quality Updates Pause start date. This property is read-only. */
    private LocalDate _qualityUpdatesPauseStartDate;
    /** Quality Updates Rollback Start datetime */
    private OffsetDateTime _qualityUpdatesRollbackStartDateTime;
    /** Specifies whether to rollback Quality Updates on the next device check in */
    private Boolean _qualityUpdatesWillBeRolledBack;
    /** Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes). */
    private Integer _scheduleImminentRestartWarningInMinutes;
    /** Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours). */
    private Integer _scheduleRestartWarningInHours;
    /** Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. */
    private Boolean _skipChecksBeforeRestart;
    /** Specifies what Windows Update notifications users see. Possible values are: notConfigured, defaultNotifications, restartWarningsOnly, disableAllNotifications. */
    private WindowsUpdateNotificationDisplayOption _updateNotificationLevel;
    /** Scheduled the update installation on the weeks of the month. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek. */
    private WindowsUpdateForBusinessUpdateWeeks _updateWeeks;
    /** Specifies whether to enable end user’s access to pause software updates. Possible values are: notConfigured, enabled, disabled. */
    private Enablement _userPauseAccess;
    /** Specifies whether to disable user’s access to scan Windows Update. Possible values are: notConfigured, enabled, disabled. */
    private Enablement _userWindowsUpdateScanAccess;
    /**
     * Instantiates a new WindowsUpdateForBusinessConfiguration and sets the default values.
     * @return a void
     */
    public WindowsUpdateForBusinessConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateForBusinessConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateForBusinessConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateForBusinessConfiguration();
    }
    /**
     * Gets the allowWindows11Upgrade property value. Allow eligible Windows 10 devices to upgrade to the latest version of Windows 11.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowWindows11Upgrade() {
        return this._allowWindows11Upgrade;
    }
    /**
     * Gets the automaticUpdateMode property value. Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault.
     * @return a automaticUpdateMode
     */
    @javax.annotation.Nullable
    public AutomaticUpdateMode getAutomaticUpdateMode() {
        return this._automaticUpdateMode;
    }
    /**
     * Gets the autoRestartNotificationDismissal property value. Specify the method by which the auto-restart required notification is dismissed. Possible values are: notConfigured, automatic, user.
     * @return a autoRestartNotificationDismissalMethod
     */
    @javax.annotation.Nullable
    public AutoRestartNotificationDismissalMethod getAutoRestartNotificationDismissal() {
        return this._autoRestartNotificationDismissal;
    }
    /**
     * Gets the businessReadyUpdatesOnly property value. Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     * @return a windowsUpdateType
     */
    @javax.annotation.Nullable
    public WindowsUpdateType getBusinessReadyUpdatesOnly() {
        return this._businessReadyUpdatesOnly;
    }
    /**
     * Gets the deadlineForFeatureUpdatesInDays property value. Number of days before feature updates are installed automatically with valid range from 0 to 30 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeadlineForFeatureUpdatesInDays() {
        return this._deadlineForFeatureUpdatesInDays;
    }
    /**
     * Gets the deadlineForQualityUpdatesInDays property value. Number of days before quality updates are installed automatically with valid range from 0 to 30 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeadlineForQualityUpdatesInDays() {
        return this._deadlineForQualityUpdatesInDays;
    }
    /**
     * Gets the deadlineGracePeriodInDays property value. Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeadlineGracePeriodInDays() {
        return this._deadlineGracePeriodInDays;
    }
    /**
     * Gets the deliveryOptimizationMode property value. Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     * @return a windowsDeliveryOptimizationMode
     */
    @javax.annotation.Nullable
    public WindowsDeliveryOptimizationMode getDeliveryOptimizationMode() {
        return this._deliveryOptimizationMode;
    }
    /**
     * Gets the deviceUpdateStates property value. Windows update for business configuration device states. This collection can contain a maximum of 500 elements.
     * @return a windowsUpdateState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsUpdateState> getDeviceUpdateStates() {
        return this._deviceUpdateStates;
    }
    /**
     * Gets the driversExcluded property value. Exclude Windows update Drivers
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDriversExcluded() {
        return this._driversExcluded;
    }
    /**
     * Gets the engagedRestartDeadlineInDays property value. Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEngagedRestartDeadlineInDays() {
        return this._engagedRestartDeadlineInDays;
    }
    /**
     * Gets the engagedRestartSnoozeScheduleInDays property value. Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEngagedRestartSnoozeScheduleInDays() {
        return this._engagedRestartSnoozeScheduleInDays;
    }
    /**
     * Gets the engagedRestartTransitionScheduleInDays property value. Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEngagedRestartTransitionScheduleInDays() {
        return this._engagedRestartTransitionScheduleInDays;
    }
    /**
     * Gets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeatureUpdatesDeferralPeriodInDays() {
        return this._featureUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the featureUpdatesPaused property value. Pause Feature Updates
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFeatureUpdatesPaused() {
        return this._featureUpdatesPaused;
    }
    /**
     * Gets the featureUpdatesPauseExpiryDateTime property value. Feature Updates Pause Expiry datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFeatureUpdatesPauseExpiryDateTime() {
        return this._featureUpdatesPauseExpiryDateTime;
    }
    /**
     * Gets the featureUpdatesPauseStartDate property value. Feature Updates Pause start date. This property is read-only.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getFeatureUpdatesPauseStartDate() {
        return this._featureUpdatesPauseStartDate;
    }
    /**
     * Gets the featureUpdatesRollbackStartDateTime property value. Feature Updates Rollback Start datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFeatureUpdatesRollbackStartDateTime() {
        return this._featureUpdatesRollbackStartDateTime;
    }
    /**
     * Gets the featureUpdatesRollbackWindowInDays property value. The number of days after a Feature Update for which a rollback is valid
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeatureUpdatesRollbackWindowInDays() {
        return this._featureUpdatesRollbackWindowInDays;
    }
    /**
     * Gets the featureUpdatesWillBeRolledBack property value. Specifies whether to rollback Feature Updates on the next device check in
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFeatureUpdatesWillBeRolledBack() {
        return this._featureUpdatesWillBeRolledBack;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsUpdateForBusinessConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowWindows11Upgrade", (n) -> { currentObject.setAllowWindows11Upgrade(n.getBooleanValue()); });
            this.put("automaticUpdateMode", (n) -> { currentObject.setAutomaticUpdateMode(n.getEnumValue(AutomaticUpdateMode.class)); });
            this.put("autoRestartNotificationDismissal", (n) -> { currentObject.setAutoRestartNotificationDismissal(n.getEnumValue(AutoRestartNotificationDismissalMethod.class)); });
            this.put("businessReadyUpdatesOnly", (n) -> { currentObject.setBusinessReadyUpdatesOnly(n.getEnumValue(WindowsUpdateType.class)); });
            this.put("deadlineForFeatureUpdatesInDays", (n) -> { currentObject.setDeadlineForFeatureUpdatesInDays(n.getIntegerValue()); });
            this.put("deadlineForQualityUpdatesInDays", (n) -> { currentObject.setDeadlineForQualityUpdatesInDays(n.getIntegerValue()); });
            this.put("deadlineGracePeriodInDays", (n) -> { currentObject.setDeadlineGracePeriodInDays(n.getIntegerValue()); });
            this.put("deliveryOptimizationMode", (n) -> { currentObject.setDeliveryOptimizationMode(n.getEnumValue(WindowsDeliveryOptimizationMode.class)); });
            this.put("deviceUpdateStates", (n) -> { currentObject.setDeviceUpdateStates(n.getCollectionOfObjectValues(WindowsUpdateState::createFromDiscriminatorValue)); });
            this.put("driversExcluded", (n) -> { currentObject.setDriversExcluded(n.getBooleanValue()); });
            this.put("engagedRestartDeadlineInDays", (n) -> { currentObject.setEngagedRestartDeadlineInDays(n.getIntegerValue()); });
            this.put("engagedRestartSnoozeScheduleInDays", (n) -> { currentObject.setEngagedRestartSnoozeScheduleInDays(n.getIntegerValue()); });
            this.put("engagedRestartTransitionScheduleInDays", (n) -> { currentObject.setEngagedRestartTransitionScheduleInDays(n.getIntegerValue()); });
            this.put("featureUpdatesDeferralPeriodInDays", (n) -> { currentObject.setFeatureUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
            this.put("featureUpdatesPaused", (n) -> { currentObject.setFeatureUpdatesPaused(n.getBooleanValue()); });
            this.put("featureUpdatesPauseExpiryDateTime", (n) -> { currentObject.setFeatureUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
            this.put("featureUpdatesPauseStartDate", (n) -> { currentObject.setFeatureUpdatesPauseStartDate(n.getLocalDateValue()); });
            this.put("featureUpdatesRollbackStartDateTime", (n) -> { currentObject.setFeatureUpdatesRollbackStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("featureUpdatesRollbackWindowInDays", (n) -> { currentObject.setFeatureUpdatesRollbackWindowInDays(n.getIntegerValue()); });
            this.put("featureUpdatesWillBeRolledBack", (n) -> { currentObject.setFeatureUpdatesWillBeRolledBack(n.getBooleanValue()); });
            this.put("installationSchedule", (n) -> { currentObject.setInstallationSchedule(n.getObjectValue(WindowsUpdateInstallScheduleType::createFromDiscriminatorValue)); });
            this.put("microsoftUpdateServiceAllowed", (n) -> { currentObject.setMicrosoftUpdateServiceAllowed(n.getBooleanValue()); });
            this.put("postponeRebootUntilAfterDeadline", (n) -> { currentObject.setPostponeRebootUntilAfterDeadline(n.getBooleanValue()); });
            this.put("prereleaseFeatures", (n) -> { currentObject.setPrereleaseFeatures(n.getEnumValue(PrereleaseFeatures.class)); });
            this.put("qualityUpdatesDeferralPeriodInDays", (n) -> { currentObject.setQualityUpdatesDeferralPeriodInDays(n.getIntegerValue()); });
            this.put("qualityUpdatesPaused", (n) -> { currentObject.setQualityUpdatesPaused(n.getBooleanValue()); });
            this.put("qualityUpdatesPauseExpiryDateTime", (n) -> { currentObject.setQualityUpdatesPauseExpiryDateTime(n.getOffsetDateTimeValue()); });
            this.put("qualityUpdatesPauseStartDate", (n) -> { currentObject.setQualityUpdatesPauseStartDate(n.getLocalDateValue()); });
            this.put("qualityUpdatesRollbackStartDateTime", (n) -> { currentObject.setQualityUpdatesRollbackStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("qualityUpdatesWillBeRolledBack", (n) -> { currentObject.setQualityUpdatesWillBeRolledBack(n.getBooleanValue()); });
            this.put("scheduleImminentRestartWarningInMinutes", (n) -> { currentObject.setScheduleImminentRestartWarningInMinutes(n.getIntegerValue()); });
            this.put("scheduleRestartWarningInHours", (n) -> { currentObject.setScheduleRestartWarningInHours(n.getIntegerValue()); });
            this.put("skipChecksBeforeRestart", (n) -> { currentObject.setSkipChecksBeforeRestart(n.getBooleanValue()); });
            this.put("updateNotificationLevel", (n) -> { currentObject.setUpdateNotificationLevel(n.getEnumValue(WindowsUpdateNotificationDisplayOption.class)); });
            this.put("updateWeeks", (n) -> { currentObject.setUpdateWeeks(n.getEnumValue(WindowsUpdateForBusinessUpdateWeeks.class)); });
            this.put("userPauseAccess", (n) -> { currentObject.setUserPauseAccess(n.getEnumValue(Enablement.class)); });
            this.put("userWindowsUpdateScanAccess", (n) -> { currentObject.setUserWindowsUpdateScanAccess(n.getEnumValue(Enablement.class)); });
        }};
    }
    /**
     * Gets the installationSchedule property value. Installation schedule
     * @return a windowsUpdateInstallScheduleType
     */
    @javax.annotation.Nullable
    public WindowsUpdateInstallScheduleType getInstallationSchedule() {
        return this._installationSchedule;
    }
    /**
     * Gets the microsoftUpdateServiceAllowed property value. Allow Microsoft Update Service
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftUpdateServiceAllowed() {
        return this._microsoftUpdateServiceAllowed;
    }
    /**
     * Gets the postponeRebootUntilAfterDeadline property value. Specifies if the device should wait until deadline for rebooting outside of active hours
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPostponeRebootUntilAfterDeadline() {
        return this._postponeRebootUntilAfterDeadline;
    }
    /**
     * Gets the prereleaseFeatures property value. The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     * @return a prereleaseFeatures
     */
    @javax.annotation.Nullable
    public PrereleaseFeatures getPrereleaseFeatures() {
        return this._prereleaseFeatures;
    }
    /**
     * Gets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQualityUpdatesDeferralPeriodInDays() {
        return this._qualityUpdatesDeferralPeriodInDays;
    }
    /**
     * Gets the qualityUpdatesPaused property value. Pause Quality Updates
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQualityUpdatesPaused() {
        return this._qualityUpdatesPaused;
    }
    /**
     * Gets the qualityUpdatesPauseExpiryDateTime property value. Quality Updates Pause Expiry datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQualityUpdatesPauseExpiryDateTime() {
        return this._qualityUpdatesPauseExpiryDateTime;
    }
    /**
     * Gets the qualityUpdatesPauseStartDate property value. Quality Updates Pause start date. This property is read-only.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getQualityUpdatesPauseStartDate() {
        return this._qualityUpdatesPauseStartDate;
    }
    /**
     * Gets the qualityUpdatesRollbackStartDateTime property value. Quality Updates Rollback Start datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQualityUpdatesRollbackStartDateTime() {
        return this._qualityUpdatesRollbackStartDateTime;
    }
    /**
     * Gets the qualityUpdatesWillBeRolledBack property value. Specifies whether to rollback Quality Updates on the next device check in
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQualityUpdatesWillBeRolledBack() {
        return this._qualityUpdatesWillBeRolledBack;
    }
    /**
     * Gets the scheduleImminentRestartWarningInMinutes property value. Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getScheduleImminentRestartWarningInMinutes() {
        return this._scheduleImminentRestartWarningInMinutes;
    }
    /**
     * Gets the scheduleRestartWarningInHours property value. Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getScheduleRestartWarningInHours() {
        return this._scheduleRestartWarningInHours;
    }
    /**
     * Gets the skipChecksBeforeRestart property value. Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipChecksBeforeRestart() {
        return this._skipChecksBeforeRestart;
    }
    /**
     * Gets the updateNotificationLevel property value. Specifies what Windows Update notifications users see. Possible values are: notConfigured, defaultNotifications, restartWarningsOnly, disableAllNotifications.
     * @return a windowsUpdateNotificationDisplayOption
     */
    @javax.annotation.Nullable
    public WindowsUpdateNotificationDisplayOption getUpdateNotificationLevel() {
        return this._updateNotificationLevel;
    }
    /**
     * Gets the updateWeeks property value. Scheduled the update installation on the weeks of the month. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek.
     * @return a windowsUpdateForBusinessUpdateWeeks
     */
    @javax.annotation.Nullable
    public WindowsUpdateForBusinessUpdateWeeks getUpdateWeeks() {
        return this._updateWeeks;
    }
    /**
     * Gets the userPauseAccess property value. Specifies whether to enable end user’s access to pause software updates. Possible values are: notConfigured, enabled, disabled.
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getUserPauseAccess() {
        return this._userPauseAccess;
    }
    /**
     * Gets the userWindowsUpdateScanAccess property value. Specifies whether to disable user’s access to scan Windows Update. Possible values are: notConfigured, enabled, disabled.
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getUserWindowsUpdateScanAccess() {
        return this._userWindowsUpdateScanAccess;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowWindows11Upgrade", this.getAllowWindows11Upgrade());
        writer.writeEnumValue("automaticUpdateMode", this.getAutomaticUpdateMode());
        writer.writeEnumValue("autoRestartNotificationDismissal", this.getAutoRestartNotificationDismissal());
        writer.writeEnumValue("businessReadyUpdatesOnly", this.getBusinessReadyUpdatesOnly());
        writer.writeIntegerValue("deadlineForFeatureUpdatesInDays", this.getDeadlineForFeatureUpdatesInDays());
        writer.writeIntegerValue("deadlineForQualityUpdatesInDays", this.getDeadlineForQualityUpdatesInDays());
        writer.writeIntegerValue("deadlineGracePeriodInDays", this.getDeadlineGracePeriodInDays());
        writer.writeEnumValue("deliveryOptimizationMode", this.getDeliveryOptimizationMode());
        writer.writeCollectionOfObjectValues("deviceUpdateStates", this.getDeviceUpdateStates());
        writer.writeBooleanValue("driversExcluded", this.getDriversExcluded());
        writer.writeIntegerValue("engagedRestartDeadlineInDays", this.getEngagedRestartDeadlineInDays());
        writer.writeIntegerValue("engagedRestartSnoozeScheduleInDays", this.getEngagedRestartSnoozeScheduleInDays());
        writer.writeIntegerValue("engagedRestartTransitionScheduleInDays", this.getEngagedRestartTransitionScheduleInDays());
        writer.writeIntegerValue("featureUpdatesDeferralPeriodInDays", this.getFeatureUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("featureUpdatesPaused", this.getFeatureUpdatesPaused());
        writer.writeOffsetDateTimeValue("featureUpdatesPauseExpiryDateTime", this.getFeatureUpdatesPauseExpiryDateTime());
        writer.writeLocalDateValue("featureUpdatesPauseStartDate", this.getFeatureUpdatesPauseStartDate());
        writer.writeOffsetDateTimeValue("featureUpdatesRollbackStartDateTime", this.getFeatureUpdatesRollbackStartDateTime());
        writer.writeIntegerValue("featureUpdatesRollbackWindowInDays", this.getFeatureUpdatesRollbackWindowInDays());
        writer.writeBooleanValue("featureUpdatesWillBeRolledBack", this.getFeatureUpdatesWillBeRolledBack());
        writer.writeObjectValue("installationSchedule", this.getInstallationSchedule());
        writer.writeBooleanValue("microsoftUpdateServiceAllowed", this.getMicrosoftUpdateServiceAllowed());
        writer.writeBooleanValue("postponeRebootUntilAfterDeadline", this.getPostponeRebootUntilAfterDeadline());
        writer.writeEnumValue("prereleaseFeatures", this.getPrereleaseFeatures());
        writer.writeIntegerValue("qualityUpdatesDeferralPeriodInDays", this.getQualityUpdatesDeferralPeriodInDays());
        writer.writeBooleanValue("qualityUpdatesPaused", this.getQualityUpdatesPaused());
        writer.writeOffsetDateTimeValue("qualityUpdatesPauseExpiryDateTime", this.getQualityUpdatesPauseExpiryDateTime());
        writer.writeLocalDateValue("qualityUpdatesPauseStartDate", this.getQualityUpdatesPauseStartDate());
        writer.writeOffsetDateTimeValue("qualityUpdatesRollbackStartDateTime", this.getQualityUpdatesRollbackStartDateTime());
        writer.writeBooleanValue("qualityUpdatesWillBeRolledBack", this.getQualityUpdatesWillBeRolledBack());
        writer.writeIntegerValue("scheduleImminentRestartWarningInMinutes", this.getScheduleImminentRestartWarningInMinutes());
        writer.writeIntegerValue("scheduleRestartWarningInHours", this.getScheduleRestartWarningInHours());
        writer.writeBooleanValue("skipChecksBeforeRestart", this.getSkipChecksBeforeRestart());
        writer.writeEnumValue("updateNotificationLevel", this.getUpdateNotificationLevel());
        writer.writeEnumValue("updateWeeks", this.getUpdateWeeks());
        writer.writeEnumValue("userPauseAccess", this.getUserPauseAccess());
        writer.writeEnumValue("userWindowsUpdateScanAccess", this.getUserWindowsUpdateScanAccess());
    }
    /**
     * Sets the allowWindows11Upgrade property value. Allow eligible Windows 10 devices to upgrade to the latest version of Windows 11.
     * @param value Value to set for the allowWindows11Upgrade property.
     * @return a void
     */
    public void setAllowWindows11Upgrade(@javax.annotation.Nullable final Boolean value) {
        this._allowWindows11Upgrade = value;
    }
    /**
     * Sets the automaticUpdateMode property value. Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault.
     * @param value Value to set for the automaticUpdateMode property.
     * @return a void
     */
    public void setAutomaticUpdateMode(@javax.annotation.Nullable final AutomaticUpdateMode value) {
        this._automaticUpdateMode = value;
    }
    /**
     * Sets the autoRestartNotificationDismissal property value. Specify the method by which the auto-restart required notification is dismissed. Possible values are: notConfigured, automatic, user.
     * @param value Value to set for the autoRestartNotificationDismissal property.
     * @return a void
     */
    public void setAutoRestartNotificationDismissal(@javax.annotation.Nullable final AutoRestartNotificationDismissalMethod value) {
        this._autoRestartNotificationDismissal = value;
    }
    /**
     * Sets the businessReadyUpdatesOnly property value. Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     * @param value Value to set for the businessReadyUpdatesOnly property.
     * @return a void
     */
    public void setBusinessReadyUpdatesOnly(@javax.annotation.Nullable final WindowsUpdateType value) {
        this._businessReadyUpdatesOnly = value;
    }
    /**
     * Sets the deadlineForFeatureUpdatesInDays property value. Number of days before feature updates are installed automatically with valid range from 0 to 30 days
     * @param value Value to set for the deadlineForFeatureUpdatesInDays property.
     * @return a void
     */
    public void setDeadlineForFeatureUpdatesInDays(@javax.annotation.Nullable final Integer value) {
        this._deadlineForFeatureUpdatesInDays = value;
    }
    /**
     * Sets the deadlineForQualityUpdatesInDays property value. Number of days before quality updates are installed automatically with valid range from 0 to 30 days
     * @param value Value to set for the deadlineForQualityUpdatesInDays property.
     * @return a void
     */
    public void setDeadlineForQualityUpdatesInDays(@javax.annotation.Nullable final Integer value) {
        this._deadlineForQualityUpdatesInDays = value;
    }
    /**
     * Sets the deadlineGracePeriodInDays property value. Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days
     * @param value Value to set for the deadlineGracePeriodInDays property.
     * @return a void
     */
    public void setDeadlineGracePeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._deadlineGracePeriodInDays = value;
    }
    /**
     * Sets the deliveryOptimizationMode property value. Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     * @param value Value to set for the deliveryOptimizationMode property.
     * @return a void
     */
    public void setDeliveryOptimizationMode(@javax.annotation.Nullable final WindowsDeliveryOptimizationMode value) {
        this._deliveryOptimizationMode = value;
    }
    /**
     * Sets the deviceUpdateStates property value. Windows update for business configuration device states. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the deviceUpdateStates property.
     * @return a void
     */
    public void setDeviceUpdateStates(@javax.annotation.Nullable final java.util.List<WindowsUpdateState> value) {
        this._deviceUpdateStates = value;
    }
    /**
     * Sets the driversExcluded property value. Exclude Windows update Drivers
     * @param value Value to set for the driversExcluded property.
     * @return a void
     */
    public void setDriversExcluded(@javax.annotation.Nullable final Boolean value) {
        this._driversExcluded = value;
    }
    /**
     * Sets the engagedRestartDeadlineInDays property value. Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days
     * @param value Value to set for the engagedRestartDeadlineInDays property.
     * @return a void
     */
    public void setEngagedRestartDeadlineInDays(@javax.annotation.Nullable final Integer value) {
        this._engagedRestartDeadlineInDays = value;
    }
    /**
     * Sets the engagedRestartSnoozeScheduleInDays property value. Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days
     * @param value Value to set for the engagedRestartSnoozeScheduleInDays property.
     * @return a void
     */
    public void setEngagedRestartSnoozeScheduleInDays(@javax.annotation.Nullable final Integer value) {
        this._engagedRestartSnoozeScheduleInDays = value;
    }
    /**
     * Sets the engagedRestartTransitionScheduleInDays property value. Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days
     * @param value Value to set for the engagedRestartTransitionScheduleInDays property.
     * @return a void
     */
    public void setEngagedRestartTransitionScheduleInDays(@javax.annotation.Nullable final Integer value) {
        this._engagedRestartTransitionScheduleInDays = value;
    }
    /**
     * Sets the featureUpdatesDeferralPeriodInDays property value. Defer Feature Updates by these many days
     * @param value Value to set for the featureUpdatesDeferralPeriodInDays property.
     * @return a void
     */
    public void setFeatureUpdatesDeferralPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._featureUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the featureUpdatesPaused property value. Pause Feature Updates
     * @param value Value to set for the featureUpdatesPaused property.
     * @return a void
     */
    public void setFeatureUpdatesPaused(@javax.annotation.Nullable final Boolean value) {
        this._featureUpdatesPaused = value;
    }
    /**
     * Sets the featureUpdatesPauseExpiryDateTime property value. Feature Updates Pause Expiry datetime
     * @param value Value to set for the featureUpdatesPauseExpiryDateTime property.
     * @return a void
     */
    public void setFeatureUpdatesPauseExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._featureUpdatesPauseExpiryDateTime = value;
    }
    /**
     * Sets the featureUpdatesPauseStartDate property value. Feature Updates Pause start date. This property is read-only.
     * @param value Value to set for the featureUpdatesPauseStartDate property.
     * @return a void
     */
    public void setFeatureUpdatesPauseStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._featureUpdatesPauseStartDate = value;
    }
    /**
     * Sets the featureUpdatesRollbackStartDateTime property value. Feature Updates Rollback Start datetime
     * @param value Value to set for the featureUpdatesRollbackStartDateTime property.
     * @return a void
     */
    public void setFeatureUpdatesRollbackStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._featureUpdatesRollbackStartDateTime = value;
    }
    /**
     * Sets the featureUpdatesRollbackWindowInDays property value. The number of days after a Feature Update for which a rollback is valid
     * @param value Value to set for the featureUpdatesRollbackWindowInDays property.
     * @return a void
     */
    public void setFeatureUpdatesRollbackWindowInDays(@javax.annotation.Nullable final Integer value) {
        this._featureUpdatesRollbackWindowInDays = value;
    }
    /**
     * Sets the featureUpdatesWillBeRolledBack property value. Specifies whether to rollback Feature Updates on the next device check in
     * @param value Value to set for the featureUpdatesWillBeRolledBack property.
     * @return a void
     */
    public void setFeatureUpdatesWillBeRolledBack(@javax.annotation.Nullable final Boolean value) {
        this._featureUpdatesWillBeRolledBack = value;
    }
    /**
     * Sets the installationSchedule property value. Installation schedule
     * @param value Value to set for the installationSchedule property.
     * @return a void
     */
    public void setInstallationSchedule(@javax.annotation.Nullable final WindowsUpdateInstallScheduleType value) {
        this._installationSchedule = value;
    }
    /**
     * Sets the microsoftUpdateServiceAllowed property value. Allow Microsoft Update Service
     * @param value Value to set for the microsoftUpdateServiceAllowed property.
     * @return a void
     */
    public void setMicrosoftUpdateServiceAllowed(@javax.annotation.Nullable final Boolean value) {
        this._microsoftUpdateServiceAllowed = value;
    }
    /**
     * Sets the postponeRebootUntilAfterDeadline property value. Specifies if the device should wait until deadline for rebooting outside of active hours
     * @param value Value to set for the postponeRebootUntilAfterDeadline property.
     * @return a void
     */
    public void setPostponeRebootUntilAfterDeadline(@javax.annotation.Nullable final Boolean value) {
        this._postponeRebootUntilAfterDeadline = value;
    }
    /**
     * Sets the prereleaseFeatures property value. The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     * @param value Value to set for the prereleaseFeatures property.
     * @return a void
     */
    public void setPrereleaseFeatures(@javax.annotation.Nullable final PrereleaseFeatures value) {
        this._prereleaseFeatures = value;
    }
    /**
     * Sets the qualityUpdatesDeferralPeriodInDays property value. Defer Quality Updates by these many days
     * @param value Value to set for the qualityUpdatesDeferralPeriodInDays property.
     * @return a void
     */
    public void setQualityUpdatesDeferralPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this._qualityUpdatesDeferralPeriodInDays = value;
    }
    /**
     * Sets the qualityUpdatesPaused property value. Pause Quality Updates
     * @param value Value to set for the qualityUpdatesPaused property.
     * @return a void
     */
    public void setQualityUpdatesPaused(@javax.annotation.Nullable final Boolean value) {
        this._qualityUpdatesPaused = value;
    }
    /**
     * Sets the qualityUpdatesPauseExpiryDateTime property value. Quality Updates Pause Expiry datetime
     * @param value Value to set for the qualityUpdatesPauseExpiryDateTime property.
     * @return a void
     */
    public void setQualityUpdatesPauseExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._qualityUpdatesPauseExpiryDateTime = value;
    }
    /**
     * Sets the qualityUpdatesPauseStartDate property value. Quality Updates Pause start date. This property is read-only.
     * @param value Value to set for the qualityUpdatesPauseStartDate property.
     * @return a void
     */
    public void setQualityUpdatesPauseStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._qualityUpdatesPauseStartDate = value;
    }
    /**
     * Sets the qualityUpdatesRollbackStartDateTime property value. Quality Updates Rollback Start datetime
     * @param value Value to set for the qualityUpdatesRollbackStartDateTime property.
     * @return a void
     */
    public void setQualityUpdatesRollbackStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._qualityUpdatesRollbackStartDateTime = value;
    }
    /**
     * Sets the qualityUpdatesWillBeRolledBack property value. Specifies whether to rollback Quality Updates on the next device check in
     * @param value Value to set for the qualityUpdatesWillBeRolledBack property.
     * @return a void
     */
    public void setQualityUpdatesWillBeRolledBack(@javax.annotation.Nullable final Boolean value) {
        this._qualityUpdatesWillBeRolledBack = value;
    }
    /**
     * Sets the scheduleImminentRestartWarningInMinutes property value. Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes).
     * @param value Value to set for the scheduleImminentRestartWarningInMinutes property.
     * @return a void
     */
    public void setScheduleImminentRestartWarningInMinutes(@javax.annotation.Nullable final Integer value) {
        this._scheduleImminentRestartWarningInMinutes = value;
    }
    /**
     * Sets the scheduleRestartWarningInHours property value. Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).
     * @param value Value to set for the scheduleRestartWarningInHours property.
     * @return a void
     */
    public void setScheduleRestartWarningInHours(@javax.annotation.Nullable final Integer value) {
        this._scheduleRestartWarningInHours = value;
    }
    /**
     * Sets the skipChecksBeforeRestart property value. Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc.
     * @param value Value to set for the skipChecksBeforeRestart property.
     * @return a void
     */
    public void setSkipChecksBeforeRestart(@javax.annotation.Nullable final Boolean value) {
        this._skipChecksBeforeRestart = value;
    }
    /**
     * Sets the updateNotificationLevel property value. Specifies what Windows Update notifications users see. Possible values are: notConfigured, defaultNotifications, restartWarningsOnly, disableAllNotifications.
     * @param value Value to set for the updateNotificationLevel property.
     * @return a void
     */
    public void setUpdateNotificationLevel(@javax.annotation.Nullable final WindowsUpdateNotificationDisplayOption value) {
        this._updateNotificationLevel = value;
    }
    /**
     * Sets the updateWeeks property value. Scheduled the update installation on the weeks of the month. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek.
     * @param value Value to set for the updateWeeks property.
     * @return a void
     */
    public void setUpdateWeeks(@javax.annotation.Nullable final WindowsUpdateForBusinessUpdateWeeks value) {
        this._updateWeeks = value;
    }
    /**
     * Sets the userPauseAccess property value. Specifies whether to enable end user’s access to pause software updates. Possible values are: notConfigured, enabled, disabled.
     * @param value Value to set for the userPauseAccess property.
     * @return a void
     */
    public void setUserPauseAccess(@javax.annotation.Nullable final Enablement value) {
        this._userPauseAccess = value;
    }
    /**
     * Sets the userWindowsUpdateScanAccess property value. Specifies whether to disable user’s access to scan Windows Update. Possible values are: notConfigured, enabled, disabled.
     * @param value Value to set for the userWindowsUpdateScanAccess property.
     * @return a void
     */
    public void setUserWindowsUpdateScanAccess(@javax.annotation.Nullable final Enablement value) {
        this._userWindowsUpdateScanAccess = value;
    }
}
