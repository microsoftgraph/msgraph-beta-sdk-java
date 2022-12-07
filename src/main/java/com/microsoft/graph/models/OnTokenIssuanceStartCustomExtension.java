package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartCustomExtension extends CustomAuthenticationExtension implements Parsable {
    /** The claimsForTokenConfiguration property */
    private java.util.List<OnTokenIssuanceStartReturnClaim> _claimsForTokenConfiguration;
    /**
     * Instantiates a new OnTokenIssuanceStartCustomExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnTokenIssuanceStartCustomExtension() {
        super();
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartCustomExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnTokenIssuanceStartCustomExtension
     */
    @javax.annotation.Nonnull
    public static OnTokenIssuanceStartCustomExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartCustomExtension();
    }
    /**
     * Gets the claimsForTokenConfiguration property value. The claimsForTokenConfiguration property
     * @return a onTokenIssuanceStartReturnClaim
     */
    @javax.annotation.Nullable
    public java.util.List<OnTokenIssuanceStartReturnClaim> getClaimsForTokenConfiguration() {
        return this._claimsForTokenConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("claimsForTokenConfiguration", (n) -> { this.setClaimsForTokenConfiguration(n.getCollectionOfObjectValues(OnTokenIssuanceStartReturnClaim::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("claimsForTokenConfiguration", this.getClaimsForTokenConfiguration());
    }
    /**
     * Sets the claimsForTokenConfiguration property value. The claimsForTokenConfiguration property
     * @param value Value to set for the claimsForTokenConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaimsForTokenConfiguration(@javax.annotation.Nullable final java.util.List<OnTokenIssuanceStartReturnClaim> value) {
        this._claimsForTokenConfiguration = value;
    }
}
