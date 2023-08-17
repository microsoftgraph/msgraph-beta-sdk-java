package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesApplicationSegment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     */
    private String alternateUrl;
    /**
     * CORS Rule definition for a particular application segment.
     */
    private java.util.List<CorsConfiguration> corsConfigurations;
    /**
     * The published external URL for the application segment; for example, https://intranet.contoso.com./
     */
    private String externalUrl;
    /**
     * The internal URL of the application segment; for example, https://intranet/.
     */
    private String internalUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new onPremisesApplicationSegment and sets the default values.
     */
    public OnPremisesApplicationSegment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesApplicationSegment
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesApplicationSegment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesApplicationSegment();
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
     * Gets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlternateUrl() {
        return this.alternateUrl;
    }
    /**
     * Gets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @return a corsConfiguration
     */
    @jakarta.annotation.Nullable
    public java.util.List<CorsConfiguration> getCorsConfigurations() {
        return this.corsConfigurations;
    }
    /**
     * Gets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExternalUrl() {
        return this.externalUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("corsConfigurations", (n) -> { this.setCorsConfigurations(n.getCollectionOfObjectValues(CorsConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInternalUrl() {
        return this.internalUrl;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeCollectionOfObjectValues("corsConfigurations", this.getCorsConfigurations());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the alternateUrl property value. If you're configuring a traffic manager in front of multiple App Proxy application segments, contains the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     */
    public void setAlternateUrl(@jakarta.annotation.Nullable final String value) {
        this.alternateUrl = value;
    }
    /**
     * Sets the corsConfigurations property value. CORS Rule definition for a particular application segment.
     * @param value Value to set for the corsConfigurations property.
     */
    public void setCorsConfigurations(@jakarta.annotation.Nullable final java.util.List<CorsConfiguration> value) {
        this.corsConfigurations = value;
    }
    /**
     * Sets the externalUrl property value. The published external URL for the application segment; for example, https://intranet.contoso.com./
     * @param value Value to set for the externalUrl property.
     */
    public void setExternalUrl(@jakarta.annotation.Nullable final String value) {
        this.externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internal URL of the application segment; for example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     */
    public void setInternalUrl(@jakarta.annotation.Nullable final String value) {
        this.internalUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
