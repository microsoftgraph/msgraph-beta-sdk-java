package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the properties used for Assignment Filter. */
public class DeviceAndAppManagementAssignmentFilter extends Entity implements Parsable {
    /** Creation time of the Assignment Filter. */
    private OffsetDateTime _createdDateTime;
    /** Description of the Assignment Filter. */
    private String _description;
    /** DisplayName of the Assignment Filter. */
    private String _displayName;
    /** Last modified time of the Assignment Filter. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown. */
    private DevicePlatformType _platform;
    /** RoleScopeTags of the Assignment Filter. */
    private java.util.List<String> _roleScopeTags;
    /** Rule definition of the Assignment Filter. */
    private String _rule;
    /**
     * Instantiates a new deviceAndAppManagementAssignmentFilter and sets the default values.
     * @return a void
     */
    public DeviceAndAppManagementAssignmentFilter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAndAppManagementAssignmentFilter
     */
    @javax.annotation.Nonnull
    public static DeviceAndAppManagementAssignmentFilter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceAndAppManagementAssignmentFilter": return new DeviceAndAppManagementAssignmentFilter();
            }
        }
        return new DeviceAndAppManagementAssignmentFilter();
    }
    /**
     * Gets the createdDateTime property value. Creation time of the Assignment Filter.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the Assignment Filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. DisplayName of the Assignment Filter.
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
        final DeviceAndAppManagementAssignmentFilter currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
            this.put("roleScopeTags", (n) -> { currentObject.setRoleScopeTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("rule", (n) -> { currentObject.setRule(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the Assignment Filter.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the platform property value. Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this._platform;
    }
    /**
     * Gets the roleScopeTags property value. RoleScopeTags of the Assignment Filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTags() {
        return this._roleScopeTags;
    }
    /**
     * Gets the rule property value. Rule definition of the Assignment Filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRule() {
        return this._rule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeCollectionOfPrimitiveValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeStringValue("rule", this.getRule());
    }
    /**
     * Sets the createdDateTime property value. Creation time of the Assignment Filter.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the Assignment Filter.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. DisplayName of the Assignment Filter.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the Assignment Filter.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the platform property value. Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     * @param value Value to set for the platform property.
     * @return a void
     */
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._platform = value;
    }
    /**
     * Sets the roleScopeTags property value. RoleScopeTags of the Assignment Filter.
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    public void setRoleScopeTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTags = value;
    }
    /**
     * Sets the rule property value. Rule definition of the Assignment Filter.
     * @param value Value to set for the rule property.
     * @return a void
     */
    public void setRule(@javax.annotation.Nullable final String value) {
        this._rule = value;
    }
}
