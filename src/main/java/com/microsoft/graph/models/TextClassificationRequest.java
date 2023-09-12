package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TextClassificationRequest extends Entity implements Parsable {
    /**
     * The contentMetaData property
     */
    private ClassificationRequestContentMetaData contentMetaData;
    /**
     * The fileExtension property
     */
    private String fileExtension;
    /**
     * The matchTolerancesToInclude property
     */
    private EnumSet<MlClassificationMatchTolerance> matchTolerancesToInclude;
    /**
     * The scopesToRun property
     */
    private EnumSet<SensitiveTypeScope> scopesToRun;
    /**
     * The sensitiveTypeIds property
     */
    private java.util.List<String> sensitiveTypeIds;
    /**
     * The text property
     */
    private String text;
    /**
     * Instantiates a new textClassificationRequest and sets the default values.
     */
    public TextClassificationRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a textClassificationRequest
     */
    @jakarta.annotation.Nonnull
    public static TextClassificationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextClassificationRequest();
    }
    /**
     * Gets the contentMetaData property value. The contentMetaData property
     * @return a classificationRequestContentMetaData
     */
    @jakarta.annotation.Nullable
    public ClassificationRequestContentMetaData getContentMetaData() {
        return this.contentMetaData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentMetaData", (n) -> { this.setContentMetaData(n.getObjectValue(ClassificationRequestContentMetaData::createFromDiscriminatorValue)); });
        deserializerMap.put("fileExtension", (n) -> { this.setFileExtension(n.getStringValue()); });
        deserializerMap.put("matchTolerancesToInclude", (n) -> { this.setMatchTolerancesToInclude(n.getEnumSetValue(MlClassificationMatchTolerance.class)); });
        deserializerMap.put("scopesToRun", (n) -> { this.setScopesToRun(n.getEnumSetValue(SensitiveTypeScope.class)); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { this.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileExtension property value. The fileExtension property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileExtension() {
        return this.fileExtension;
    }
    /**
     * Gets the matchTolerancesToInclude property value. The matchTolerancesToInclude property
     * @return a mlClassificationMatchTolerance
     */
    @jakarta.annotation.Nullable
    public EnumSet<MlClassificationMatchTolerance> getMatchTolerancesToInclude() {
        return this.matchTolerancesToInclude;
    }
    /**
     * Gets the scopesToRun property value. The scopesToRun property
     * @return a sensitiveTypeScope
     */
    @jakarta.annotation.Nullable
    public EnumSet<SensitiveTypeScope> getScopesToRun() {
        return this.scopesToRun;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this.sensitiveTypeIds;
    }
    /**
     * Gets the text property value. The text property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentMetaData", this.getContentMetaData());
        writer.writeStringValue("fileExtension", this.getFileExtension());
        writer.writeEnumSetValue("matchTolerancesToInclude", this.getMatchTolerancesToInclude());
        writer.writeEnumSetValue("scopesToRun", this.getScopesToRun());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
        writer.writeStringValue("text", this.getText());
    }
    /**
     * Sets the contentMetaData property value. The contentMetaData property
     * @param value Value to set for the contentMetaData property.
     */
    public void setContentMetaData(@jakarta.annotation.Nullable final ClassificationRequestContentMetaData value) {
        this.contentMetaData = value;
    }
    /**
     * Sets the fileExtension property value. The fileExtension property
     * @param value Value to set for the fileExtension property.
     */
    public void setFileExtension(@jakarta.annotation.Nullable final String value) {
        this.fileExtension = value;
    }
    /**
     * Sets the matchTolerancesToInclude property value. The matchTolerancesToInclude property
     * @param value Value to set for the matchTolerancesToInclude property.
     */
    public void setMatchTolerancesToInclude(@jakarta.annotation.Nullable final EnumSet<MlClassificationMatchTolerance> value) {
        this.matchTolerancesToInclude = value;
    }
    /**
     * Sets the scopesToRun property value. The scopesToRun property
     * @param value Value to set for the scopesToRun property.
     */
    public void setScopesToRun(@jakarta.annotation.Nullable final EnumSet<SensitiveTypeScope> value) {
        this.scopesToRun = value;
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     */
    public void setSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sensitiveTypeIds = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
}
