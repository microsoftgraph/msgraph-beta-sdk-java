package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PayloadDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Payload coachmark details.
     */
    private java.util.List<PayloadCoachmark> coachmarks;
    /**
     * Payload content details.
     */
    private String content;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The phishing URL used to target a user.
     */
    private String phishingUrl;
    /**
     * Instantiates a new payloadDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PayloadDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a payloadDetail
     */
    @javax.annotation.Nonnull
    public static PayloadDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emailPayloadDetail": return new EmailPayloadDetail();
            }
        }
        return new PayloadDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the coachmarks property value. Payload coachmark details.
     * @return a payloadCoachmark
     */
    @javax.annotation.Nullable
    public java.util.List<PayloadCoachmark> getCoachmarks() {
        return this.coachmarks;
    }
    /**
     * Gets the content property value. Payload content details.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("coachmarks", (n) -> { this.setCoachmarks(n.getCollectionOfObjectValues(PayloadCoachmark::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("phishingUrl", (n) -> { this.setPhishingUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the phishingUrl property value. The phishing URL used to target a user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhishingUrl() {
        return this.phishingUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("coachmarks", this.getCoachmarks());
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("phishingUrl", this.getPhishingUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the coachmarks property value. Payload coachmark details.
     * @param value Value to set for the coachmarks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoachmarks(@javax.annotation.Nullable final java.util.List<PayloadCoachmark> value) {
        this.coachmarks = value;
    }
    /**
     * Sets the content property value. Payload content details.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the phishingUrl property value. The phishing URL used to target a user.
     * @param value Value to set for the phishingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhishingUrl(@javax.annotation.Nullable final String value) {
        this.phishingUrl = value;
    }
}
