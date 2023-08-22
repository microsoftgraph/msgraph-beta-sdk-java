package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A mapping of application identifiers to associated domains.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSAssociatedDomainsItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The application identifier of the app to associate domains with.
     */
    private String applicationIdentifier;
    /**
     * Determines whether data should be downloaded directly or via a CDN.
     */
    private Boolean directDownloadsEnabled;
    /**
     * The list of domains to associate.
     */
    private java.util.List<String> domains;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new macOSAssociatedDomainsItem and sets the default values.
     */
    public MacOSAssociatedDomainsItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSAssociatedDomainsItem
     */
    @jakarta.annotation.Nonnull
    public static MacOSAssociatedDomainsItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSAssociatedDomainsItem();
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
     * Gets the applicationIdentifier property value. The application identifier of the app to associate domains with.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    /**
     * Gets the directDownloadsEnabled property value. Determines whether data should be downloaded directly or via a CDN.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDirectDownloadsEnabled() {
        return this.directDownloadsEnabled;
    }
    /**
     * Gets the domains property value. The list of domains to associate.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("applicationIdentifier", (n) -> { this.setApplicationIdentifier(n.getStringValue()); });
        deserializerMap.put("directDownloadsEnabled", (n) -> { this.setDirectDownloadsEnabled(n.getBooleanValue()); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationIdentifier", this.getApplicationIdentifier());
        writer.writeBooleanValue("directDownloadsEnabled", this.getDirectDownloadsEnabled());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
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
     * Sets the applicationIdentifier property value. The application identifier of the app to associate domains with.
     * @param value Value to set for the applicationIdentifier property.
     */
    public void setApplicationIdentifier(@jakarta.annotation.Nullable final String value) {
        this.applicationIdentifier = value;
    }
    /**
     * Sets the directDownloadsEnabled property value. Determines whether data should be downloaded directly or via a CDN.
     * @param value Value to set for the directDownloadsEnabled property.
     */
    public void setDirectDownloadsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.directDownloadsEnabled = value;
    }
    /**
     * Sets the domains property value. The list of domains to associate.
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.domains = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
