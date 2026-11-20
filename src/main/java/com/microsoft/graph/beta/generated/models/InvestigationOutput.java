package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A read-only stored-file output owned and contained by an investigation session. Inherited id is the existing stable opaque stored-file identifier, unique within its session. Metadata and content reads enforce the same parent-session authorization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvestigationOutput extends Entity implements Parsable {
    /**
     * Instantiates a new {@link InvestigationOutput} and sets the default values.
     */
    public InvestigationOutput() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvestigationOutput}
     */
    @jakarta.annotation.Nonnull
    public static InvestigationOutput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvestigationOutput();
    }
    /**
     * Gets the content property value. The output bytes, retrieved through /security/agenticSecurity/sessions/{session-id}/outputs/{output-id}/content. The stream isn&apos;t inline in the metadata response. Read-only.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(InvestigationOutputType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. Output category: summary text or an artifact, both retrieved through the authenticated content stream.
     * @return a {@link InvestigationOutputType}
     */
    @jakarta.annotation.Nullable
    public InvestigationOutputType getKind() {
        return this.backingStore.get("kind");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("kind", this.getKind());
    }
    /**
     * Sets the content property value. The output bytes, retrieved through /security/agenticSecurity/sessions/{session-id}/outputs/{output-id}/content. The stream isn&apos;t inline in the metadata response. Read-only.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the kind property value. Output category: summary text or an artifact, both retrieved through the authenticated content stream.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final InvestigationOutputType value) {
        this.backingStore.set("kind", value);
    }
}
