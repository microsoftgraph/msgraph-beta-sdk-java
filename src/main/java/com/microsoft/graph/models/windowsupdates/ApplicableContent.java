package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicableContent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The catalogEntry property
     */
    private CatalogEntry catalogEntry;
    /**
     * Collection of devices and recommendations for applicable catalog content.
     */
    private java.util.List<ApplicableContentDeviceMatch> matchedDevices;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new applicableContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicableContent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applicableContent
     */
    @javax.annotation.Nonnull
    public static ApplicableContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicableContent();
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
     * Gets the catalogEntry property value. The catalogEntry property
     * @return a catalogEntry
     */
    @javax.annotation.Nullable
    public CatalogEntry getCatalogEntry() {
        return this.catalogEntry;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("catalogEntry", (n) -> { this.setCatalogEntry(n.getObjectValue(CatalogEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("matchedDevices", (n) -> { this.setMatchedDevices(n.getCollectionOfObjectValues(ApplicableContentDeviceMatch::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchedDevices property value. Collection of devices and recommendations for applicable catalog content.
     * @return a applicableContentDeviceMatch
     */
    @javax.annotation.Nullable
    public java.util.List<ApplicableContentDeviceMatch> getMatchedDevices() {
        return this.matchedDevices;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("catalogEntry", this.getCatalogEntry());
        writer.writeCollectionOfObjectValues("matchedDevices", this.getMatchedDevices());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the catalogEntry property value. The catalogEntry property
     * @param value Value to set for the catalogEntry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalogEntry(@javax.annotation.Nullable final CatalogEntry value) {
        this.catalogEntry = value;
    }
    /**
     * Sets the matchedDevices property value. Collection of devices and recommendations for applicable catalog content.
     * @param value Value to set for the matchedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchedDevices(@javax.annotation.Nullable final java.util.List<ApplicableContentDeviceMatch> value) {
        this.matchedDevices = value;
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
}
