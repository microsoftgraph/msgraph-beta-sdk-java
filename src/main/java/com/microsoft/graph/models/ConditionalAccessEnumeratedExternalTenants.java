package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessEnumeratedExternalTenants extends ConditionalAccessExternalTenants implements Parsable {
    /** The members property */
    private java.util.List<String> _members;
    /**
     * Instantiates a new ConditionalAccessEnumeratedExternalTenants and sets the default values.
     * @return a void
     */
    public ConditionalAccessEnumeratedExternalTenants() {
        super();
        this.setOdataType("#microsoft.graph.conditionalAccessEnumeratedExternalTenants");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessEnumeratedExternalTenants
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessEnumeratedExternalTenants createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessEnumeratedExternalTenants();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessEnumeratedExternalTenants currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the members property value. The members property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMembers() {
        return this._members;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("members", this.getMembers());
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._members = value;
    }
}
