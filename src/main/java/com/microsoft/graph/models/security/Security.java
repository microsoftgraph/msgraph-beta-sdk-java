package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Security extends Entity implements Parsable {
    /** The informationProtection property */
    private InformationProtection _informationProtection;
    /**
     * Instantiates a new security and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Security() {
        super();
        this.setOdataType("#microsoft.graph.security.security");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a security
     */
    @javax.annotation.Nonnull
    public static Security createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Security();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Security currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("informationProtection", (n) -> { currentObject.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a informationProtection
     */
    @javax.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this._informationProtection;
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
        writer.writeObjectValue("informationProtection", this.getInformationProtection());
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationProtection(@javax.annotation.Nullable final InformationProtection value) {
        this._informationProtection = value;
    }
}
