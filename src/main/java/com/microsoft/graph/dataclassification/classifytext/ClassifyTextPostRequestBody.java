package com.microsoft.graph.dataclassification.classifytext;

import com.microsoft.graph.models.MlClassificationMatchTolerance;
import com.microsoft.graph.models.SensitiveTypeScope;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the classifyText method. */
public class ClassifyTextPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The fileExtension property */
    private String _fileExtension;
    /** The matchTolerancesToInclude property */
    private MlClassificationMatchTolerance _matchTolerancesToInclude;
    /** The scopesToRun property */
    private SensitiveTypeScope _scopesToRun;
    /** The sensitiveTypeIds property */
    private java.util.List<String> _sensitiveTypeIds;
    /** The text property */
    private String _text;
    /**
     * Instantiates a new classifyTextPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClassifyTextPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classifyTextPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ClassifyTextPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyTextPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassifyTextPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("fileExtension", (n) -> { currentObject.setFileExtension(n.getStringValue()); });
        deserializerMap.put("matchTolerancesToInclude", (n) -> { currentObject.setMatchTolerancesToInclude(n.getEnumValue(MlClassificationMatchTolerance.class)); });
        deserializerMap.put("scopesToRun", (n) -> { currentObject.setScopesToRun(n.getEnumValue(SensitiveTypeScope.class)); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { currentObject.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileExtension property value. The fileExtension property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileExtension() {
        return this._fileExtension;
    }
    /**
     * Gets the matchTolerancesToInclude property value. The matchTolerancesToInclude property
     * @return a mlClassificationMatchTolerance
     */
    @javax.annotation.Nullable
    public MlClassificationMatchTolerance getMatchTolerancesToInclude() {
        return this._matchTolerancesToInclude;
    }
    /**
     * Gets the scopesToRun property value. The scopesToRun property
     * @return a sensitiveTypeScope
     */
    @javax.annotation.Nullable
    public SensitiveTypeScope getScopesToRun() {
        return this._scopesToRun;
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
     * Gets the text property value. The text property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileExtension", this.getFileExtension());
        writer.writeEnumValue("matchTolerancesToInclude", this.getMatchTolerancesToInclude());
        writer.writeEnumValue("scopesToRun", this.getScopesToRun());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
        writer.writeStringValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the fileExtension property value. The fileExtension property
     * @param value Value to set for the fileExtension property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileExtension(@javax.annotation.Nullable final String value) {
        this._fileExtension = value;
    }
    /**
     * Sets the matchTolerancesToInclude property value. The matchTolerancesToInclude property
     * @param value Value to set for the matchTolerancesToInclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchTolerancesToInclude(@javax.annotation.Nullable final MlClassificationMatchTolerance value) {
        this._matchTolerancesToInclude = value;
    }
    /**
     * Sets the scopesToRun property value. The scopesToRun property
     * @param value Value to set for the scopesToRun property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopesToRun(@javax.annotation.Nullable final SensitiveTypeScope value) {
        this._scopesToRun = value;
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
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
}
