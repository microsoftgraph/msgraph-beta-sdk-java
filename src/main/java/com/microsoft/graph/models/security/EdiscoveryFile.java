package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryFile extends File implements Parsable {
    /** Custodians associated with the file. */
    private EdiscoveryCustodian _custodian;
    /** Tags associated with the file. */
    private java.util.List<EdiscoveryReviewTag> _tags;
    /**
     * Instantiates a new EdiscoveryFile and sets the default values.
     * @return a void
     */
    public EdiscoveryFile() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryFile
     */
    @javax.annotation.Nonnull
    public static EdiscoveryFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryFile();
    }
    /**
     * Gets the custodian property value. Custodians associated with the file.
     * @return a ediscoveryCustodian
     */
    @javax.annotation.Nullable
    public EdiscoveryCustodian getCustodian() {
        return this._custodian;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryFile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("custodian", (n) -> { currentObject.setCustodian(n.getObjectValue(EdiscoveryCustodian::createFromDiscriminatorValue)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tags property value. Tags associated with the file.
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTags() {
        return this._tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("custodian", this.getCustodian());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the custodian property value. Custodians associated with the file.
     * @param value Value to set for the custodian property.
     * @return a void
     */
    public void setCustodian(@javax.annotation.Nullable final EdiscoveryCustodian value) {
        this._custodian = value;
    }
    /**
     * Sets the tags property value. Tags associated with the file.
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this._tags = value;
    }
}
