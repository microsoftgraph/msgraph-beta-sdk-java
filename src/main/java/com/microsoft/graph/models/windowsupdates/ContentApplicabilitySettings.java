package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentApplicabilitySettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Offer if the update is recommended by a vendor in the list, otherwise withhold the offer.
     */
    private java.util.List<String> offerWhileRecommendedBy;
    /**
     * Settings for governing safeguard holds on offering content.
     */
    private SafeguardSettings safeguard;
    /**
     * Instantiates a new contentApplicabilitySettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ContentApplicabilitySettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentApplicabilitySettings
     */
    @jakarta.annotation.Nonnull
    public static ContentApplicabilitySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentApplicabilitySettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offerWhileRecommendedBy", (n) -> { this.setOfferWhileRecommendedBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safeguard", (n) -> { this.setSafeguard(n.getObjectValue(SafeguardSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the offerWhileRecommendedBy property value. Offer if the update is recommended by a vendor in the list, otherwise withhold the offer.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOfferWhileRecommendedBy() {
        return this.offerWhileRecommendedBy;
    }
    /**
     * Gets the safeguard property value. Settings for governing safeguard holds on offering content.
     * @return a safeguardSettings
     */
    @jakarta.annotation.Nullable
    public SafeguardSettings getSafeguard() {
        return this.safeguard;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("offerWhileRecommendedBy", this.getOfferWhileRecommendedBy());
        writer.writeObjectValue("safeguard", this.getSafeguard());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the offerWhileRecommendedBy property value. Offer if the update is recommended by a vendor in the list, otherwise withhold the offer.
     * @param value Value to set for the offerWhileRecommendedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOfferWhileRecommendedBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.offerWhileRecommendedBy = value;
    }
    /**
     * Sets the safeguard property value. Settings for governing safeguard holds on offering content.
     * @param value Value to set for the safeguard property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSafeguard(@jakarta.annotation.Nullable final SafeguardSettings value) {
        this.safeguard = value;
    }
}
