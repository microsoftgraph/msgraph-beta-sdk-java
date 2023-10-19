package com.microsoft.graph.users.item.security.informationprotection.sensitivitylabels.microsoftgraphsecurityevaluateapplication;

import com.microsoft.graph.models.security.ContentInfo;
import com.microsoft.graph.models.security.LabelingOptions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateApplicationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The contentInfo property
     */
    private ContentInfo contentInfo;
    /**
     * The labelingOptions property
     */
    private LabelingOptions labelingOptions;
    /**
     * Instantiates a new EvaluateApplicationPostRequestBody and sets the default values.
     */
    public EvaluateApplicationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EvaluateApplicationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluateApplicationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateApplicationPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentInfo property value. The contentInfo property
     * @return a ContentInfo
     */
    @jakarta.annotation.Nullable
    public ContentInfo getContentInfo() {
        return this.contentInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("contentInfo", (n) -> { this.setContentInfo(n.getObjectValue(ContentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("labelingOptions", (n) -> { this.setLabelingOptions(n.getObjectValue(LabelingOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labelingOptions property value. The labelingOptions property
     * @return a LabelingOptions
     */
    @jakarta.annotation.Nullable
    public LabelingOptions getLabelingOptions() {
        return this.labelingOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeObjectValue("labelingOptions", this.getLabelingOptions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     */
    public void setContentInfo(@jakarta.annotation.Nullable final ContentInfo value) {
        this.contentInfo = value;
    }
    /**
     * Sets the labelingOptions property value. The labelingOptions property
     * @param value Value to set for the labelingOptions property.
     */
    public void setLabelingOptions(@jakarta.annotation.Nullable final LabelingOptions value) {
        this.labelingOptions = value;
    }
}
