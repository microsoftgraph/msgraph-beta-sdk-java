package com.microsoft.graph.models.security;

import com.microsoft.graph.models.security.FileContentThreatSubmission;
import com.microsoft.graph.models.security.FileUrlThreatSubmission;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileThreatSubmission extends ThreatSubmission implements Parsable {
    /** It specifies the file name to be submitted. */
    private String _fileName;
    /**
     * Instantiates a new FileThreatSubmission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.fileThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileThreatSubmission
     */
    @javax.annotation.Nonnull
    public static FileThreatSubmission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.fileContentThreatSubmission": return new FileContentThreatSubmission();
                case "#microsoft.graph.security.fileUrlThreatSubmission": return new FileUrlThreatSubmission();
            }
        }
        return new FileThreatSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileThreatSubmission currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the fileName property value. It specifies the file name to be submitted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
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
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the fileName property value. It specifies the file name to be submitted.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
}
