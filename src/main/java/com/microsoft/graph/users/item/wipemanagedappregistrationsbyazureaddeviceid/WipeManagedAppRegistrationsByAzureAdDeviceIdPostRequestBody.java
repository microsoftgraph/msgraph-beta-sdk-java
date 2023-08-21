package com.microsoft.graph.users.item.wipemanagedappregistrationsbyazureaddeviceid;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The azureAdDeviceId property
     */
    private String azureAdDeviceId;
    /**
     * Instantiates a new wipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody and sets the default values.
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the azureAdDeviceId property value. The azureAdDeviceId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.azureAdDeviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the azureAdDeviceId property value. The azureAdDeviceId property
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.azureAdDeviceId = value;
    }
}
