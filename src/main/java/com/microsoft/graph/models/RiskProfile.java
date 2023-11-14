package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskProfile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The humanCount property
     */
    private Integer humanCount;
    /**
     * The nonHumanCount property
     */
    private Integer nonHumanCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new RiskProfile and sets the default values.
     */
    public RiskProfile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RiskProfile
     */
    @jakarta.annotation.Nonnull
    public static RiskProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskProfile();
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
        deserializerMap.put("humanCount", (n) -> { this.setHumanCount(n.getIntegerValue()); });
        deserializerMap.put("nonHumanCount", (n) -> { this.setNonHumanCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the humanCount property value. The humanCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHumanCount() {
        return this.humanCount;
    }
    /**
     * Gets the nonHumanCount property value. The nonHumanCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonHumanCount() {
        return this.nonHumanCount;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("humanCount", this.getHumanCount());
        writer.writeIntegerValue("nonHumanCount", this.getNonHumanCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the humanCount property value. The humanCount property
     * @param value Value to set for the humanCount property.
     */
    public void setHumanCount(@jakarta.annotation.Nullable final Integer value) {
        this.humanCount = value;
    }
    /**
     * Sets the nonHumanCount property value. The nonHumanCount property
     * @param value Value to set for the nonHumanCount property.
     */
    public void setNonHumanCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonHumanCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
