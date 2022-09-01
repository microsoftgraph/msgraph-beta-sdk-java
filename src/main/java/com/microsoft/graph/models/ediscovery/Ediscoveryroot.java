package com.microsoft.graph.models.ediscovery;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Ediscoveryroot extends Entity implements Parsable {
    /** The cases property */
    private java.util.List<Case_escaped> _cases;
    /**
     * Instantiates a new Ediscoveryroot and sets the default values.
     * @return a void
     */
    public Ediscoveryroot() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.ediscoveryroot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Ediscoveryroot
     */
    @javax.annotation.Nonnull
    public static Ediscoveryroot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Ediscoveryroot();
    }
    /**
     * Gets the cases property value. The cases property
     * @return a case_escaped
     */
    @javax.annotation.Nullable
    public java.util.List<Case_escaped> getCases() {
        return this._cases;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Ediscoveryroot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cases", (n) -> { currentObject.setCases(n.getCollectionOfObjectValues(Case_escaped::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("cases", this.getCases());
    }
    /**
     * Sets the cases property value. The cases property
     * @param value Value to set for the cases property.
     * @return a void
     */
    public void setCases(@javax.annotation.Nullable final java.util.List<Case_escaped> value) {
        this._cases = value;
    }
}
