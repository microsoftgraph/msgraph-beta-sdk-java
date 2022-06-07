package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** MacOS software update state summary for a device and user */
public class MacOSSoftwareUpdateStateSummary extends Entity implements Parsable {
    /** Human readable name of the software update */
    private String _displayName;
    /** Last date time the report for this device and product key was updated. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** Product key of the software update. */
    private String _productKey;
    /** State of the software update. Possible values are: success, downloading, downloaded, installing, idle, available, scheduled, downloadFailed, downloadInsufficientSpace, downloadInsufficientPower, downloadInsufficientNetwork, installInsufficientSpace, installInsufficientPower, installFailed, commandFailed. */
    private MacOSSoftwareUpdateState _state;
    /** Software update category. Possible values are: critical, configurationDataFile, firmware, other. */
    private MacOSSoftwareUpdateCategory _updateCategory;
    /** Version of the software update */
    private String _updateVersion;
    /**
     * Instantiates a new macOSSoftwareUpdateStateSummary and sets the default values.
     * @return a void
     */
    public MacOSSoftwareUpdateStateSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateStateSummary
     */
    @javax.annotation.Nonnull
    public static MacOSSoftwareUpdateStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateStateSummary();
    }
    /**
     * Gets the displayName property value. Human readable name of the software update
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSSoftwareUpdateStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("productKey", (n) -> { currentObject.setProductKey(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(MacOSSoftwareUpdateState.class)); });
            this.put("updateCategory", (n) -> { currentObject.setUpdateCategory(n.getEnumValue(MacOSSoftwareUpdateCategory.class)); });
            this.put("updateVersion", (n) -> { currentObject.setUpdateVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the productKey property value. Product key of the software update.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this._productKey;
    }
    /**
     * Gets the state property value. State of the software update. Possible values are: success, downloading, downloaded, installing, idle, available, scheduled, downloadFailed, downloadInsufficientSpace, downloadInsufficientPower, downloadInsufficientNetwork, installInsufficientSpace, installInsufficientPower, installFailed, commandFailed.
     * @return a macOSSoftwareUpdateState
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateState getState() {
        return this._state;
    }
    /**
     * Gets the updateCategory property value. Software update category. Possible values are: critical, configurationDataFile, firmware, other.
     * @return a macOSSoftwareUpdateCategory
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateCategory getUpdateCategory() {
        return this._updateCategory;
    }
    /**
     * Gets the updateVersion property value. Version of the software update
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpdateVersion() {
        return this._updateVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeEnumValue("state", this.getState());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
        writer.writeStringValue("updateVersion", this.getUpdateVersion());
    }
    /**
     * Sets the displayName property value. Human readable name of the software update
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device and product key was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the productKey property value. Product key of the software update.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this._productKey = value;
    }
    /**
     * Sets the state property value. State of the software update. Possible values are: success, downloading, downloaded, installing, idle, available, scheduled, downloadFailed, downloadInsufficientSpace, downloadInsufficientPower, downloadInsufficientNetwork, installInsufficientSpace, installInsufficientPower, installFailed, commandFailed.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final MacOSSoftwareUpdateState value) {
        this._state = value;
    }
    /**
     * Sets the updateCategory property value. Software update category. Possible values are: critical, configurationDataFile, firmware, other.
     * @param value Value to set for the updateCategory property.
     * @return a void
     */
    public void setUpdateCategory(@javax.annotation.Nullable final MacOSSoftwareUpdateCategory value) {
        this._updateCategory = value;
    }
    /**
     * Sets the updateVersion property value. Version of the software update
     * @param value Value to set for the updateVersion property.
     * @return a void
     */
    public void setUpdateVersion(@javax.annotation.Nullable final String value) {
        this._updateVersion = value;
    }
}
