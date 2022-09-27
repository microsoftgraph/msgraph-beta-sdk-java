package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics Device without Cloud Identity. */
public class UserExperienceAnalyticsDeviceWithoutCloudIdentity extends Entity implements Parsable {
    /** Azure Active Directory Device Id */
    private String _azureAdDeviceId;
    /** The tenant attach device's name. */
    private String _deviceName;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceWithoutCloudIdentity and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceWithoutCloudIdentity
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
        return this._azureAdDeviceId;
    }
    /**
     * Gets the deviceName property value. The tenant attach device's name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDeviceWithoutCloudIdentity currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("azureAdDeviceId", (n) -> { currentObject.setAzureAdDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this._azureAdDeviceId = value;
    }
    /**
     * Sets the deviceName property value. The tenant attach device's name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
}
