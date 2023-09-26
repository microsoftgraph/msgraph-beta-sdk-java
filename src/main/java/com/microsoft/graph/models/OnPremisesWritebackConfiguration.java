package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesWritebackConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The distinguished name of the on-premises container that the customer is using to store unified groups which are created in the cloud.
     */
    private String unifiedGroupContainer;
    /**
     * The distinguished name of the on-premises container that the customer is using to store users which are created in the cloud.
     */
    private String userContainer;
    /**
     * Instantiates a new OnPremisesWritebackConfiguration and sets the default values.
     */
    public OnPremisesWritebackConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesWritebackConfiguration
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesWritebackConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesWritebackConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("unifiedGroupContainer", (n) -> { this.setUnifiedGroupContainer(n.getStringValue()); });
        deserializerMap.put("userContainer", (n) -> { this.setUserContainer(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the unifiedGroupContainer property value. The distinguished name of the on-premises container that the customer is using to store unified groups which are created in the cloud.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnifiedGroupContainer() {
        return this.unifiedGroupContainer;
    }
    /**
     * Gets the userContainer property value. The distinguished name of the on-premises container that the customer is using to store users which are created in the cloud.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserContainer() {
        return this.userContainer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("unifiedGroupContainer", this.getUnifiedGroupContainer());
        writer.writeStringValue("userContainer", this.getUserContainer());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the unifiedGroupContainer property value. The distinguished name of the on-premises container that the customer is using to store unified groups which are created in the cloud.
     * @param value Value to set for the unifiedGroupContainer property.
     */
    public void setUnifiedGroupContainer(@jakarta.annotation.Nullable final String value) {
        this.unifiedGroupContainer = value;
    }
    /**
     * Sets the userContainer property value. The distinguished name of the on-premises container that the customer is using to store users which are created in the cloud.
     * @param value Value to set for the userContainer property.
     */
    public void setUserContainer(@jakarta.annotation.Nullable final String value) {
        this.userContainer = value;
    }
}
