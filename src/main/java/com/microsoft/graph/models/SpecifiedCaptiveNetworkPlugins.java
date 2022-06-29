package microsoft.graph.models;

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
    /**
     * Instantiates a new specifiedCaptiveNetworkPlugins and sets the default values.
     * @return a void
     */
    public SpecifiedCaptiveNetworkPlugins() {
        this.setAdditionalData(new HashMap<>());
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
        return new HashMap<>(1) {{
            this.put("allowedBundleIdentifiers", (n) -> { currentObject.setAllowedBundleIdentifiers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedBundleIdentifiers", this.getAllowedBundleIdentifiers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowedBundleIdentifiers property value. Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     * @param value Value to set for the allowedBundleIdentifiers property.
     * @return a void
     */
    public void setAllowedBundleIdentifiers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedBundleIdentifiers = value;
    }
}
