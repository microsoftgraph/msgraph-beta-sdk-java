package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileClassificationRequest extends Entity implements Parsable {
    /** The file property */
    private byte[] _file;
    /** The sensitiveTypeIds property */
    private java.util.List<String> _sensitiveTypeIds;
    /**
     * Instantiates a new FileClassificationRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileClassificationRequest() {
        super();
        this.setOdataType("#microsoft.graph.fileClassificationRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileClassificationRequest
     */
    @javax.annotation.Nonnull
    public static FileClassificationRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileClassificationRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileClassificationRequest currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("file", (n) -> { currentObject.setFile(n.getByteArrayValue()); });
            this.put("sensitiveTypeIds", (n) -> { currentObject.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the file property value. The file property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getFile() {
        return this._file;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this._sensitiveTypeIds;
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
        writer.writeByteArrayValue("file", this.getFile());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFile(@javax.annotation.Nullable final byte[] value) {
        this._file = value;
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitiveTypeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sensitiveTypeIds = value;
    }
}
