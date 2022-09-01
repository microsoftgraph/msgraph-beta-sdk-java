package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceStartupProcess extends Entity implements Parsable {
    /** The user experience analytics device id. */
    private String _managedDeviceId;
    /** User experience analytics device startup process name. */
    private String _processName;
    /** The user experience analytics device startup process product name. */
    private String _productName;
    /** The User experience analytics device startup process publisher. */
    private String _publisher;
    /** User experience analytics device startup process impact in milliseconds. */
    private Integer _startupImpactInMs;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceStartupProcess and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsDeviceStartupProcess() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDeviceStartupProcess");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceStartupProcess
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupProcess createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupProcess();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDeviceStartupProcess currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("processName", (n) -> { currentObject.setProcessName(n.getStringValue()); });
            this.put("productName", (n) -> { currentObject.setProductName(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("startupImpactInMs", (n) -> { currentObject.setStartupImpactInMs(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the managedDeviceId property value. The user experience analytics device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the processName property value. User experience analytics device startup process name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessName() {
        return this._processName;
    }
    /**
     * Gets the productName property value. The user experience analytics device startup process product name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this._productName;
    }
    /**
     * Gets the publisher property value. The User experience analytics device startup process publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the startupImpactInMs property value. User experience analytics device startup process impact in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStartupImpactInMs() {
        return this._startupImpactInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeIntegerValue("startupImpactInMs", this.getStartupImpactInMs());
    }
    /**
     * Sets the managedDeviceId property value. The user experience analytics device id.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the processName property value. User experience analytics device startup process name.
     * @param value Value to set for the processName property.
     * @return a void
     */
    public void setProcessName(@javax.annotation.Nullable final String value) {
        this._processName = value;
    }
    /**
     * Sets the productName property value. The user experience analytics device startup process product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    public void setProductName(@javax.annotation.Nullable final String value) {
        this._productName = value;
    }
    /**
     * Sets the publisher property value. The User experience analytics device startup process publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the startupImpactInMs property value. User experience analytics device startup process impact in milliseconds.
     * @param value Value to set for the startupImpactInMs property.
     * @return a void
     */
    public void setStartupImpactInMs(@javax.annotation.Nullable final Integer value) {
        this._startupImpactInMs = value;
    }
}
