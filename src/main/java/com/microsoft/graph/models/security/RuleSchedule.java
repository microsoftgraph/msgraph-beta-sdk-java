package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RuleSchedule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The nextRunDateTime property
     */
    private OffsetDateTime nextRunDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The period property
     */
    private String period;
    /**
     * Instantiates a new RuleSchedule and sets the default values.
     */
    public RuleSchedule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RuleSchedule
     */
    @jakarta.annotation.Nonnull
    public static RuleSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RuleSchedule();
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
        deserializerMap.put("nextRunDateTime", (n) -> { this.setNextRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextRunDateTime property value. The nextRunDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRunDateTime() {
        return this.nextRunDateTime;
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
     * Gets the period property value. The period property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeriod() {
        return this.period;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("nextRunDateTime", this.getNextRunDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("period", this.getPeriod());
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
     * Sets the nextRunDateTime property value. The nextRunDateTime property
     * @param value Value to set for the nextRunDateTime property.
     */
    public void setNextRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRunDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final String value) {
        this.period = value;
    }
}
