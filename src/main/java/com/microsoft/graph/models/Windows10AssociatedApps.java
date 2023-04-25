package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Associated Application definition.
 */
public class Windows10AssociatedApps implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Windows 10 Application type. */
    private Windows10AppType appType;
    /** Identifier. */
    private String identifier;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new windows10AssociatedApps and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10AssociatedApps() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10AssociatedApps
     */
    @javax.annotation.Nonnull
    public static Windows10AssociatedApps createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10AssociatedApps();
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
     * Gets the appType property value. Windows 10 Application type.
     * @return a windows10AppType
     */
    @javax.annotation.Nullable
    public Windows10AppType getAppType() {
        return this.appType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("appType", (n) -> { this.setAppType(n.getEnumValue(Windows10AppType.class)); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
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
        writer.writeEnumValue("appType", this.getAppType());
        writer.writeStringValue("identifier", this.getIdentifier());
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
     * Sets the appType property value. Windows 10 Application type.
     * @param value Value to set for the appType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppType(@javax.annotation.Nullable final Windows10AppType value) {
        this.appType = value;
    }
    /**
     * Sets the identifier property value. Identifier.
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this.identifier = value;
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
