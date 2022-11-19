package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Specifies all the Captive network plugins allowed during the IKEv2 AlwaysOn VPN connection */
public class SpecifiedCaptiveNetworkPlugins implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN */
    private java.util.List<String> _allowedBundleIdentifiers;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new specifiedCaptiveNetworkPlugins and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SpecifiedCaptiveNetworkPlugins() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.specifiedCaptiveNetworkPlugins");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a specifiedCaptiveNetworkPlugins
     */
    @javax.annotation.Nonnull
    public static SpecifiedCaptiveNetworkPlugins createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpecifiedCaptiveNetworkPlugins();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowedBundleIdentifiers property value. Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedBundleIdentifiers() {
        return this._allowedBundleIdentifiers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SpecifiedCaptiveNetworkPlugins currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("allowedBundleIdentifiers", (n) -> { currentObject.setAllowedBundleIdentifiers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedBundleIdentifiers", this.getAllowedBundleIdentifiers());
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
        this._additionalData = value;
    }
    /**
     * Sets the allowedBundleIdentifiers property value. Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     * @param value Value to set for the allowedBundleIdentifiers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedBundleIdentifiers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedBundleIdentifiers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
