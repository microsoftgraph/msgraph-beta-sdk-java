package com.microsoft.graph.me.security.informationprotection.sensitivitylabels.evaluateremoval;

import com.microsoft.graph.models.security.ContentInfo;
import com.microsoft.graph.models.security.DowngradeJustification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the evaluateRemoval method. */
public class EvaluateRemovalPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The contentInfo property */
    private ContentInfo _contentInfo;
    /** The downgradeJustification property */
    private DowngradeJustification _downgradeJustification;
    /**
     * Instantiates a new evaluateRemovalPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EvaluateRemovalPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateRemovalPostRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluateRemovalPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateRemovalPostRequestBody();
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
     * Gets the contentInfo property value. The contentInfo property
     * @return a contentInfo
     */
    @javax.annotation.Nullable
    public ContentInfo getContentInfo() {
        return this._contentInfo;
    }
    /**
     * Gets the downgradeJustification property value. The downgradeJustification property
     * @return a downgradeJustification
     */
    @javax.annotation.Nullable
    public DowngradeJustification getDowngradeJustification() {
        return this._downgradeJustification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateRemovalPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("contentInfo", (n) -> { currentObject.setContentInfo(n.getObjectValue(ContentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("downgradeJustification", (n) -> { currentObject.setDowngradeJustification(n.getObjectValue(DowngradeJustification::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeObjectValue("downgradeJustification", this.getDowngradeJustification());
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
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentInfo(@javax.annotation.Nullable final ContentInfo value) {
        this._contentInfo = value;
    }
    /**
     * Sets the downgradeJustification property value. The downgradeJustification property
     * @param value Value to set for the downgradeJustification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDowngradeJustification(@javax.annotation.Nullable final DowngradeJustification value) {
        this._downgradeJustification = value;
    }
}
