package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceWithoutCloudIdentity extends Entity implements Parsable {
    /**
     * Azure Active Directory Device Id
     */
    private String azureAdDeviceId;
    /**
     * The tenant attach device's name.
     */
    private String deviceName;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceWithoutCloudIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceWithoutCloudIdentity
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceWithoutCloudIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceWithoutCloudIdentity();
    }
    /**
     * Gets the azureAdDeviceId property value. Azure Active Directory Device Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.azureAdDeviceId;
    }
    /**
     * Gets the deviceName property value. The tenant attach device's name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
    }
    /**
     * Sets the azureAdDeviceId property value. Azure Active Directory Device Id
     * @param value Value to set for the azureAdDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this.azureAdDeviceId = value;
    }
    /**
     * Sets the deviceName property value. The tenant attach device's name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
}
