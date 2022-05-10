package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppInstallSummary extends Entity implements Parsable {
    /** Number of Devices that have failed to install this app. */
    private Integer _failedDeviceCount;
    /** Number of Users that have 1 or more device that failed to install this app. */
    private Integer _failedUserCount;
    /** Number of Devices that have successfully installed this app. */
    private Integer _installedDeviceCount;
    /** Number of Users whose devices have all succeeded to install this app. */
    private Integer _installedUserCount;
    /** Number of Devices that are not applicable for this app. */
    private Integer _notApplicableDeviceCount;
    /** Number of Users whose devices were all not applicable for this app. */
    private Integer _notApplicableUserCount;
    /** Number of Devices that does not have this app installed. */
    private Integer _notInstalledDeviceCount;
    /** Number of Users that have 1 or more devices that did not install this app. */
    private Integer _notInstalledUserCount;
    /** Number of Devices that have been notified to install this app. */
    private Integer _pendingInstallDeviceCount;
    /** Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures. */
    private Integer _pendingInstallUserCount;
    /**
     * Instantiates a new mobileAppInstallSummary and sets the default values.
     * @return a void
     */
    public MobileAppInstallSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppInstallSummary
     */
    @javax.annotation.Nonnull
    public static MobileAppInstallSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallSummary();
    }
    /**
     * Gets the failedDeviceCount property value. Number of Devices that have failed to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * Gets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUserCount() {
        return this._failedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppInstallSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
            this.put("failedUserCount", (n) -> { currentObject.setFailedUserCount(n.getIntegerValue()); });
            this.put("installedDeviceCount", (n) -> { currentObject.setInstalledDeviceCount(n.getIntegerValue()); });
            this.put("installedUserCount", (n) -> { currentObject.setInstalledUserCount(n.getIntegerValue()); });
            this.put("notApplicableDeviceCount", (n) -> { currentObject.setNotApplicableDeviceCount(n.getIntegerValue()); });
            this.put("notApplicableUserCount", (n) -> { currentObject.setNotApplicableUserCount(n.getIntegerValue()); });
            this.put("notInstalledDeviceCount", (n) -> { currentObject.setNotInstalledDeviceCount(n.getIntegerValue()); });
            this.put("notInstalledUserCount", (n) -> { currentObject.setNotInstalledUserCount(n.getIntegerValue()); });
            this.put("pendingInstallDeviceCount", (n) -> { currentObject.setPendingInstallDeviceCount(n.getIntegerValue()); });
            this.put("pendingInstallUserCount", (n) -> { currentObject.setPendingInstallUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the installedDeviceCount property value. Number of Devices that have successfully installed this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this._installedDeviceCount;
    }
    /**
     * Gets the installedUserCount property value. Number of Users whose devices have all succeeded to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledUserCount() {
        return this._installedUserCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of Devices that are not applicable for this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this._notApplicableDeviceCount;
    }
    /**
     * Gets the notApplicableUserCount property value. Number of Users whose devices were all not applicable for this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this._notApplicableUserCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Number of Devices that does not have this app installed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this._notInstalledDeviceCount;
    }
    /**
     * Gets the notInstalledUserCount property value. Number of Users that have 1 or more devices that did not install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledUserCount() {
        return this._notInstalledUserCount;
    }
    /**
     * Gets the pendingInstallDeviceCount property value. Number of Devices that have been notified to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingInstallDeviceCount() {
        return this._pendingInstallDeviceCount;
    }
    /**
     * Gets the pendingInstallUserCount property value. Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingInstallUserCount() {
        return this._pendingInstallUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("installedUserCount", this.getInstalledUserCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledUserCount", this.getNotInstalledUserCount());
        writer.writeIntegerValue("pendingInstallDeviceCount", this.getPendingInstallDeviceCount());
        writer.writeIntegerValue("pendingInstallUserCount", this.getPendingInstallUserCount());
    }
    /**
     * Sets the failedDeviceCount property value. Number of Devices that have failed to install this app.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this app.
     * @param value Value to set for the failedUserCount property.
     * @return a void
     */
    public void setFailedUserCount(@javax.annotation.Nullable final Integer value) {
        this._failedUserCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Number of Devices that have successfully installed this app.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._installedDeviceCount = value;
    }
    /**
     * Sets the installedUserCount property value. Number of Users whose devices have all succeeded to install this app.
     * @param value Value to set for the installedUserCount property.
     * @return a void
     */
    public void setInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this._installedUserCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of Devices that are not applicable for this app.
     * @param value Value to set for the notApplicableDeviceCount property.
     * @return a void
     */
    public void setNotApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableDeviceCount = value;
    }
    /**
     * Sets the notApplicableUserCount property value. Number of Users whose devices were all not applicable for this app.
     * @param value Value to set for the notApplicableUserCount property.
     * @return a void
     */
    public void setNotApplicableUserCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableUserCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Number of Devices that does not have this app installed.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledDeviceCount = value;
    }
    /**
     * Sets the notInstalledUserCount property value. Number of Users that have 1 or more devices that did not install this app.
     * @param value Value to set for the notInstalledUserCount property.
     * @return a void
     */
    public void setNotInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledUserCount = value;
    }
    /**
     * Sets the pendingInstallDeviceCount property value. Number of Devices that have been notified to install this app.
     * @param value Value to set for the pendingInstallDeviceCount property.
     * @return a void
     */
    public void setPendingInstallDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingInstallDeviceCount = value;
    }
    /**
     * Sets the pendingInstallUserCount property value. Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.
     * @param value Value to set for the pendingInstallUserCount property.
     * @return a void
     */
    public void setPendingInstallUserCount(@javax.annotation.Nullable final Integer value) {
        this._pendingInstallUserCount = value;
    }
}
