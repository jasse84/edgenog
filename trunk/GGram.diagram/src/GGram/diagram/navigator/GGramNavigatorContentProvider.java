package GGram.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class GGramNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public GGramNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator it = myEditingDomain.getResourceSet().getResources()
				.iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(),
					GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof GGram.diagram.navigator.GGramNavigatorGroup) {
			GGram.diagram.navigator.GGramNavigatorGroup group = (GGram.diagram.navigator.GGramNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof GGram.diagram.navigator.GGramNavigatorItem) {
			GGram.diagram.navigator.GGramNavigatorItem navigatorItem = (GGram.diagram.navigator.GGramNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (GGram.diagram.part.GGramVisualIDRegistry.getVisualID(view)) {

		case GGram.diagram.edit.parts.GenogramEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup links = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Genogram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup outgoinglinks = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Woman_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup incominglinks = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Woman_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.ManEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup incominglinks = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Man_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.EngagementEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Engagement_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Engagement_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.HasChildEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_HasChild_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.CohabitationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Cohabitation_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Cohabitation_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.CohabitationAndSeparationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_CohabitationAndSeparation_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_CohabitationAndSeparation_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.MarriageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Marriage_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Marriage_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.LoveAffairEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_LoveAffair_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_LoveAffair_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.NullityEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Nullity_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Nullity_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.DivorceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Divorce_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Divorce_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.RelationshipEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Relationship_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GGram.diagram.navigator.GGramNavigatorGroup source = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_Relationship_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GGram.diagram.edit.parts.HasAdoptedChildEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			GGram.diagram.navigator.GGramNavigatorGroup target = new GGram.diagram.navigator.GGramNavigatorGroup(
					GGram.diagram.part.Messages.NavigatorGroupName_HasAdoptedChild_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), GGram.diagram.part.GGramVisualIDRegistry
					.getType(GGram.diagram.edit.parts.WomanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(view),
					GGram.diagram.part.GGramVisualIDRegistry
							.getType(GGram.diagram.edit.parts.ManEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GGram.diagram.edit.parts.GenogramEditPart.MODEL_ID
				.equals(GGram.diagram.part.GGramVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new GGram.diagram.navigator.GGramNavigatorItem((View) it
					.next(), parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof GGram.diagram.navigator.GGramAbstractNavigatorItem) {
			GGram.diagram.navigator.GGramAbstractNavigatorItem abstractNavigatorItem = (GGram.diagram.navigator.GGramAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
