package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class SharedEmailDomain extends Entity implements Parsable {
    /** The provisioningStatus property */
    private String _provisioningStatus;
    /**
     * Instantiates a new sharedEmailDomain and sets the default values.
     * @return a void
     */
    public SharedEmailDomain() {
        super();
        this.setOdataType("#microsoft.graph.sharedEmailDomain");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedEmailDomain
     */
    @javax.annotation.Nonnull
    public static SharedEmailDomain createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedEmailDomain();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedEmailDomain currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("provisioningStatus", (n) -> { currentObject.setProvisioningStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the provisioningStatus property value. The provisioningStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningStatus() {
        return this._provisioningStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
    }
    /**
     * Sets the provisioningStatus property value. The provisioningStatus property
     * @param value Value to set for the provisioningStatus property.
     * @return a void
     */
    public void setProvisioningStatus(@javax.annotation.Nullable final String value) {
        this._provisioningStatus = value;
    }
}
