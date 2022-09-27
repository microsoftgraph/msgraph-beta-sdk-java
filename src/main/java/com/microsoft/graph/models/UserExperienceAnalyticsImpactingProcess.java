package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics top impacting process entity. */
public class UserExperienceAnalyticsImpactingProcess extends Entity implements Parsable {
    /** The category of impacting process. */
    private String _category;
    /** The description of process. */
    private String _description;
    /** The unique identifier of the impacted device. */
    private String _deviceId;
    /** The impact value of the process. Valid values 0 to 1.79769313486232E+308 */
    private Double _impactValue;
    /** The process name. */
    private String _processName;
    /** The publisher of the process. */
    private String _publisher;
    /**
     * Instantiates a new userExperienceAnalyticsImpactingProcess and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsImpactingProcess() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsImpactingProcess");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsImpactingProcess
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsImpactingProcess createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsImpactingProcess();
    }
    /**
     * Gets the category property value. The category of impacting process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this._category;
    }
    /**
     * Gets the description property value. The description of process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the impacted device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsImpactingProcess currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("impactValue", (n) -> { currentObject.setImpactValue(n.getDoubleValue()); });
            this.put("processName", (n) -> { currentObject.setProcessName(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        }};
    }
    /**
     * Gets the impactValue property value. The impact value of the process. Valid values 0 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getImpactValue() {
        return this._impactValue;
    }
    /**
     * Gets the processName property value. The process name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessName() {
        return this._processName;
    }
    /**
     * Gets the publisher property value. The publisher of the process.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeDoubleValue("impactValue", this.getImpactValue());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("publisher", this.getPublisher());
    }
    /**
     * Sets the category property value. The category of impacting process.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final String value) {
        this._category = value;
    }
    /**
     * Sets the description property value. The description of process.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the impacted device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the impactValue property value. The impact value of the process. Valid values 0 to 1.79769313486232E+308
     * @param value Value to set for the impactValue property.
     * @return a void
     */
    public void setImpactValue(@javax.annotation.Nullable final Double value) {
        this._impactValue = value;
    }
    /**
     * Sets the processName property value. The process name.
     * @param value Value to set for the processName property.
     * @return a void
     */
    public void setProcessName(@javax.annotation.Nullable final String value) {
        this._processName = value;
    }
    /**
     * Sets the publisher property value. The publisher of the process.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
}
